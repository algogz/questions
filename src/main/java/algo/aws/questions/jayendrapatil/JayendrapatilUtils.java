package algo.aws.questions.jayendrapatil;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.log4j.Log4j2;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
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

    public static void saveAllQuestions() throws IOException {
        String dir = "/Users/algo/aws/questions/jayendrapatil";
        Map<String, String> urls = retrieveUrls();
        for(String url:urls.keySet()){
            log.info("retriving {}", url);
            Path path = getPath(dir, url);
            if(Files.exists(path)){
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

    public static Path getPath(String dir, String url){
        int idx = url.lastIndexOf('/', url.length() - 2);
        String filename = url.substring(idx, url.length() - 1);
        Path path = Paths.get(dir, filename + ".json");
        return path;
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
                choiceText = choiceText.replaceAll("\\(\\)", "");   // remove '()'
                choiceText = choiceText.replaceAll("\\(Refer \\)", "");   // remove '(Refer )'

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

}
