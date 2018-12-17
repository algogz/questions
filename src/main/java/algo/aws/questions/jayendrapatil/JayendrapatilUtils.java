package algo.aws.questions.jayendrapatil;

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

@Log4j2
public class JayendrapatilUtils {
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    static String jsonDir = "/Users/algo/aws/questions/jayendrapatil/json";
    static String baseDir = "jayendrapatil/";

    public static void saveAllQuestions(boolean overwrite) throws IOException {
        Map<String, String> urls = retrieveUrls();
        for(String url:urls.keySet()){
            log.info("retriving {}", url);
            String module = getModule(url);
            Path path = Paths.get(baseDir,"json", module + ".json");
            if(!overwrite && Files.exists(path)){
                continue;       // skip if file exists
            }
            List<Question> list = retrieveQuestions(url);
            if(list.size() == 0){
                continue;       // don't save empty file
            }
            String json = gson.toJson(list);
            Files.write(path, json.getBytes());
        }
    }

    public static void saveAllHtml(boolean overwrite) throws IOException {
        Map<String, String> urls = retrieveUrls();
        for(String url:urls.keySet()){
            log.info("retriving {}", url);
            String module = getModule(url);
            Path path = Paths.get(baseDir,"html", module + ".html");
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
        Map<String, String> urls = retrieveUrls();
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

    private static String getModule(String url){
        int idx = url.lastIndexOf('/', url.length() - 2);
        String module = url.substring(idx+1, url.length() - 1);
        return module;
    }

    /**
     * Get all the links
     *
     * @return Map[url, service name]
     * @throws IOException
     */
    public static Map<String, String> retrieveUrls() throws IOException {
        Map<String, String> urlMap = new LinkedHashMap<>();
        Document doc = Jsoup.connect("http://jayendrapatil.com/").get();
        Element servicesElm = doc.select("#post-9555 > div > ul:nth-child(8)").get(0);
        Elements aElms = servicesElm.select("a");
        log.debug(aElms.size());
        for(Element aElm:aElms){
            String href = aElm.attr("href");
            String text = aElm.text();
            urlMap.put(href, text);
        }
        return urlMap;
    }

    public static List<Question> retrieveQuestions(String url) throws IOException {
        List<Question> questionList = new ArrayList<>();
        Document doc = Jsoup.connect(url).get();

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

    public static void convertToMarkdown(Path jsonPath, Path mdPath) throws IOException {
        byte[] buf = Files.readAllBytes(jsonPath);
        String json = new String(buf);
        List<Question> list = gson.fromJson(json, new TypeToken<List<Question>>(){}.getType());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<list.size(); i++){
            Question q = list.get(i);
            sb.append("### Question ").append(i+1).append(":\n\n");
            sb.append(q.getText()).append("\n\n");
            List<String> choiceList = q.getChoiceList();
            for (String choice : choiceList) {
                sb.append("- ").append(choice).append("\n");
            }
            sb.append("\n");
            sb.append("<details><summary>Answer:</summary><p>\n");
            sb.append(q.getAnswerList().toString()).append("\n\n");
            sb.append("Explanation:\n\n");
            List<String> commentList = q.getCommentList();
            for(String comment:commentList){
                sb.append(comment).append("\n\n");
            }
            sb.append("</p></details><hr>\n\n");
        }
        Files.write(mdPath, sb.toString().getBytes());
    }

    public static void analyse() throws IOException {
        Files.list(Paths.get(jsonDir));
    }

}
