package algo.aws.questions.freecram;

import algo.aws.questions.MarkdownUtils;
import algo.aws.questions.jayendrapatil.Question;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.log4j.Log4j2;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Log4j2
public class FreeCramUtils {
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    static String baseDir = "freecram/";


    public static void convertJsonToMarkdown() throws IOException {
        Path jsonFile = Paths.get(baseDir, "freecram-questions.json");
        log.info("Converting {}", jsonFile);
        Path mdFile = Paths.get(baseDir,"freecram-questions.md");
        MarkdownUtils.convertJsonToMarkdown(jsonFile, mdFile);
    }

    static Pattern pattern = Pattern.compile("question-(\\d+)\\.html");
    public static void allHtml2Json() throws IOException {
        Map<String, String> urls = retrieveUrls();
        List<String> uriList = new ArrayList<>(urls.keySet());
        Path htmlDir = Paths.get(baseDir, "html");
        List<Question> questionList = new ArrayList<>();
        Files.list(htmlDir).forEach(htmlFile -> {
            try {
                log.info("html2json {}", htmlFile);
                String filename = htmlFile.getFileName().toString();
                Matcher matcher = pattern.matcher(filename);
                String url = null;
                if(matcher.find()) {
                    int number = Integer.parseInt(matcher.group(1));
                    url = "https://www.freecram.com" + uriList.get(number-1);
                }
                Document doc = Jsoup.parse(htmlFile.toFile(), "utf-8");
                questionList.add(retrieveQuestionFromHtml(doc, url));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        Path jsonFile = Paths.get(baseDir, "freecram-questions.json");
        questionList.sort((o1, o2) -> {
            if (o1.getQuestionNumber() > o2.getQuestionNumber()) {
                return 1;
            } else if (o1.getQuestionNumber() < o2.getQuestionNumber()) {
                return -1;
            }
            return 0;
        });
        String json = gson.toJson(questionList);
        Files.write(jsonFile, json.getBytes());
    }

    public static void downloadAllHtml(boolean overwrite) throws IOException {
        Map<String, String> urls = retrieveUrls();
        int qNumber = 1;
        for(String uri:urls.keySet()){
            log.info("retriving {}", uri);
            String url = "https://www.freecram.com" + uri;
            Path path = Paths.get(baseDir,"html", "question-" + (qNumber++) + ".html");
            if(!overwrite && Files.exists(path)){
                continue;       // skip if file exists
            }
            URL u = new URL(url);
            URLConnection conn = u.openConnection();
            conn.setRequestProperty("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36");
            InputStream is = conn.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path.toFile()));

            byte[] buf = new byte[10240];
            int len;
            while(-1 != (len = bis.read(buf))){
                bos.write(buf, 0, len);
            }

            bos.close();
            bis.close();
        }
    }


    /**
     * Get all the links
     *
     * @return Map[url, service name]
     * @throws IOException
     */
    public static Map<String, String> retrieveUrls() throws IOException {
        String url = "https://www.freecram.com/question/Citrix.AWS-Architect.v2018-12-10.q237/if-i-write-the-below-command-what-does-it-do-ec2-run-ami-e3a5408a-n-20-g-appserver";
        Map<String, String> urlMap = new LinkedHashMap<>();
        Document doc = Jsoup.connect(url).get();
        Element listElm = doc.select("body > div.container.body-content > div.row > div.col-sm-12.col-md-3.aw-side-bar > dl.barlist").get(0);
        Elements aElms = listElm.select("a");
        log.debug(aElms.size());
        for(Element aElm:aElms){
            String href = aElm.attr("href");
            String text = aElm.text();
            urlMap.put(href, text);
        }
        return urlMap;
    }

    public static Question retrieveQuestionFromHtml(Document doc, String url) {
        Element qaElm = doc.select("div.qa").get(0);
        Element qaQuestionElm = qaElm.select("div.qa-question").get(0);
        String text = retrieveText(qaQuestionElm);
        String qNumber = qaElm.select("h4 span.text-danger").get(0).text();

        if(null == url){
            url = "freecram." + qNumber;
        }
        Question question = new Question(url, Integer.parseInt(qNumber), text);

        Elements qaOptionsElms = qaElm.select("div.qa-options label");
        qaOptionsElms.forEach(optionElm -> question.getChoiceList().add(optionElm.text()));

        Element qaAnswerexpElm = qaElm.select("div.qa-answerexp").get(0);
        String answer = qaAnswerexpElm.select("div:nth-child(1) > span").get(0).text();
        answer.chars().forEach(c -> {
            if(',' != (char)c) {
                question.getAnswerList().add((char) c);
            }
        });

        Element qaExpElm = qaAnswerexpElm.select("div.qa_explanation").get(0);
        String explanation = retrieveText(qaExpElm);
        Arrays.asList(explanation.split("\n\n")).forEach(s -> {
            if("Explanation/Reference:".equals(s) || "Explanation:".equals(s)){
                return;
            }
            if(s.length() > 0) {
                question.getCommentList().add(s);
            }
        });
        question.getCommentList().add(String.format("[Free Cram Question Link](%s)", url));

        return question;
    }

    private static String retrieveText(Element elm) {
        StringBuilder sb = new StringBuilder();

        elm.childNodes().forEach(node -> {
            if(node instanceof TextNode){
                sb.append(((TextNode) node).getWholeText());
            }else if(node instanceof Element){
                if("br".equals(((Element) node).tagName())) {
                    sb.append("\n\n");
                }
            }
        });

        return sb.toString();
    }
}
