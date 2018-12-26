package algo.aws.questions.jayendrapatil;

import algo.aws.questions.MarkdownUtils;
import algo.aws.questions.QuestionUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import lombok.extern.log4j.Log4j2;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Log4j2
public class JayendrapatilUtils {
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    static String jsonDir = "/Users/algo/aws/questions/jayendrapatil/json";
    static String baseDir = "jayendrapatil/";
    public static String WHITEPAPER = "whitepaper";
    public static String SERVICE = "service";

    public static void saveAllQuestions(String part, boolean overwrite) throws IOException {
        Path htmlDir = Paths.get(baseDir, "html/" + part);
        Files.list(htmlDir).forEach(htmlFile -> {
            try {
                log.info("Handling {}", htmlFile);

                String module = getModule(htmlFile);
                String url = String.format("http://jayendrapatil.com/%s/", module);
                Path jsonFile = Paths.get(baseDir,"json/" + part, module + ".json");
                if(!overwrite && Files.exists(jsonFile)){
                    return;       // skip if file exists
                }
                Document doc = Jsoup.parse(htmlFile.toFile(), "utf-8");
                List<Question> list = retrieveQuestions(doc, url);
                if(list.size() == 0){
                    return;       // don't save empty file
                }
                String json = gson.toJson(list);
                Files.write(jsonFile, json.getBytes());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }


    public static void convertAllToMarkdown(String part, boolean overwrite) throws IOException {
        Path jsonlDir = Paths.get(baseDir, "json/" + part);
        Files.list(jsonlDir).forEach(jsonFile -> {
            try {
                log.info("Converting {}", jsonFile);
                String module = getModule(jsonFile);
                Path mdFile = Paths.get(baseDir,"md/" + part, module + ".md");
                if(!overwrite && Files.exists(mdFile)){
                    return;       // skip if file exists
                }
                MarkdownUtils.convertJsonToMarkdown(jsonFile, mdFile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public static void saveAllHtml(String part, boolean overwrite) throws IOException {
        Map<String, String> urls = retrieveUrls(part);
        for(String url:urls.keySet()){
            log.info("retriving {}", url);
            String module = getModule(url);
            Path path = Paths.get(baseDir,"html/" + part, module + ".html");
            if(!overwrite && Files.exists(path)){
                continue;       // skip if file exists
            }
            URL u = new URL(url);
            URLConnection conn = u.openConnection();
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

    public static void saveAllProfessionalQuestions() throws IOException {
        Map<String, String> urls = retrieveUrls("Service");
        List<Question> proList = new ArrayList<>();
        for(String url:urls.keySet()){
            log.info("retriving {}", url);
            List<Question> list = retrieveQuestions(url);
            list.stream().filter(q -> q.isProfessional).forEach(proList::add);
        }
        String json = gson.toJson(proList);
        Path path = Paths.get(jsonDir, "/professional-questions.json");
        Files.write(path, json.getBytes());
    }

    public static void pickProfessionalQuestions() throws IOException {
        String[] parts = {"service", "whitepaper"};
        List<Question> proList = new ArrayList<>();
        for(String part: parts) {
            Path path = Paths.get("jayendrapatil/json/" + part);
            for (Path jsonFile : Files.list(path).collect(Collectors.toList())) {
                proList.addAll(QuestionUtils.readQuestions(jsonFile).stream().filter(q -> q.isProfessional()).collect(Collectors.toList()));
            }
        }
        String json = gson.toJson(proList);
        Path path = Paths.get(jsonDir, "/professional-questions.json");
        Files.write(path, json.getBytes());
    }

    private static String getModule(String url){
        int idx = url.lastIndexOf('/', url.length() - 2);
        String module = url.substring(idx+1, url.length() - 1);
        return module;
    }

    private static String getModule(Path path){
        String filename = path.getFileName().toString();
        int idx = filename.lastIndexOf('.');
        String module = filename.substring(0, idx);
        return module;
    }

    /**
     * Get all the links
     *
     * @return Map[url, service name]
     * @throws IOException
     */
    public static Map<String, String> retrieveUrls(String part) throws IOException {
        Map<String, String> urlMap = new LinkedHashMap<>();
        Document doc = Jsoup.connect("http://jayendrapatil.com/").get();
        Element ulElm;
        if(WHITEPAPER.equalsIgnoreCase(part)){
            ulElm = doc.select("#post-9555 > div > ul:nth-child(6)").get(0);
        } else {
            ulElm = doc.select("#post-9555 > div > ul:nth-child(8)").get(0);
        }
        Elements aElms = ulElm.select("a");
        log.debug(aElms.size());
        for(Element aElm:aElms){
            String href = aElm.attr("href");
            String text = aElm.text();
            urlMap.put(href, text);
        }
        return urlMap;
    }

    public static List<Question> retrieveQuestions(String url) throws IOException {
        Document doc = Jsoup.connect(url).get();
        return retrieveQuestions(doc, url);
    }

    public static List<Question> retrieveQuestions(Document doc, String url) {
        List<Question> questionList = new ArrayList<>();

        Elements qElms = findQuestionElements(doc);
        if(null == qElms) return questionList;

        for(int q=0; q<qElms.size(); q++){
            log.debug("retrieveQuestions question {}",q+1);
            Element qElm = qElms.get(q);
            Elements olElms = qElm.select("ol");
            if(olElms.size() == 0) continue;

            Element olElm = olElms.get(0);
            olElm.remove();

            String text = qElm.text();
            Question question = new Question(url, q + 1, text);
            questionList.add(question);
            question.setProfessional(text.endsWith("[PROFESSIONAL]"));

            question.getCommentList().add(String.format("Question %d@%s", q+1, url));
            Elements choiceElms = olElm.children();
            for(int i=0; i<choiceElms.size(); i++){
                Character letter = (char)('A' + i);
                Element choiceElm = choiceElms.get(i);
                String answer = null;

                Elements aElms = choiceElm.select("a");
                if(aElms.size() > 0){
                    question.getCommentList().add(String.format("%s: %s", letter, aElms.get(0).attr("href")));
                    aElms.remove();
                }

                Elements strongElms = choiceElm.select("strong");
                if(strongElms.size() > 0){
                    question.getAnswerList().add(letter);
                    answer = strongElms.text();
                    strongElms.remove();
                }

                Elements commentElms = choiceElm.select("span");
                if(commentElms.size() > 0){
                    question.getCommentList().add(String.format("%s: %s", letter, commentElms.text()));
                    commentElms.remove();
                }
                String choiceText = choiceElm.text();
                choiceText = choiceText.replaceAll("\\([ ,.]*\\)", "");   // remove '()'
                choiceText = choiceText.replaceAll("\\([ ,.]*Refer[ ,.]*\\)", "");   // remove '(Refer )'

                if(null != answer && choiceText.length() > 0){
                    question.getCommentList().add(String.format("%s: %s", letter, choiceText));
                }
                question.getChoiceList().add(String.format("%s. %s", letter, null == answer?choiceText:answer));
            }

        }
        return questionList;
    }

    private static Elements findQuestionElements(Document doc) {
        Elements h2Elms = doc.select("h2");
        for(Element h2Elm:h2Elms){
            if("AWS Certification Exam Practice Questions".equals(h2Elm.text())
                || "Sample Exam Questions".equals(h2Elm.text())){
                Element elm = h2Elm.nextElementSibling();

                if("ol".equals(elm.nodeName())){
                    return elm.children();
                }

                elm = elm.nextElementSibling();
                if("ol".equals(elm.nodeName())){
                    return elm.children();
                }
            }
        }

        Elements quoteElms = doc.select("blockquote");
        for(Element quoteElm:quoteElms) {
            Element elm = quoteElm.nextElementSibling();

            if ("ol".equals(elm.nodeName())) {
                return elm.children();
            }
        }
        return null;
    }

    public static void analyse() throws IOException {
        Path output = Paths.get(baseDir, "analysis.csv");
        StringBuilder sb = new StringBuilder();
        Path jsonDir = Paths.get(baseDir, "json");
        Files.list(jsonDir).forEach(jsonFile -> {
            try {
                String module = getModule(jsonFile);
                byte[] buf = Files.readAllBytes(jsonFile);
                String json = new String(buf);
                List<Question> list = gson.fromJson(json, new TypeToken<List<Question>>() {}.getType());
                long proCount = list.stream().filter(question -> question.isProfessional).count();
                sb.append(module).append(", ").append(list.size()).append(", ").append(proCount).append("\n");
            } catch(IOException e){
                throw new RuntimeException(e);
            }
        });
        Files.write(output, sb.toString().getBytes());
    }
}
