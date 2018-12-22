package algo.aws.questions;

import algo.aws.questions.jayendrapatil.Question;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import lombok.extern.log4j.Log4j2;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Log4j2
public class MarkdownUtils {
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    static Pattern pattern = Pattern.compile("(\\d+)");
    public static List<Question> convertMarkdownPageToJson(String mdPageUrl, Path jsonPath) throws IOException {
        Document doc = Jsoup.connect(mdPageUrl).get();
        Elements titleElms = doc.select("article > h3");
        List<Question> qList = new ArrayList<>(titleElms.size());
        titleElms.forEach(titleElm -> {
            String title = titleElm.text();
            int number = 0;
            Matcher matcher = pattern.matcher(title);
            if(matcher.find()){
                number = Integer.parseInt(matcher.group(1));
            }

            StringBuilder sb = new StringBuilder();
            Element nextElm = titleElm.nextElementSibling();
            do {
                String tagName = nextElm.tagName();
                if("p".equals(tagName)) {
                    String text = nextElm.html();
                    sb.append(text).append("\n\n");
                } else if("ul".equals(tagName)){
                    nextElm.select("li").forEach(elm -> sb.append("- ").append(elm.html()).append("\n"));
                    sb.append("\n");
                } else {
                    sb.append(nextElm.outerHtml()).append("\n\n");
                }
                nextElm = nextElm.nextElementSibling();
            } while(!nextElm.text().startsWith("A. "));

            Question q = new Question(title, number, sb.toString());
            qList.add(q);

            Element choicesElm = nextElm;   // the last element should be <ul>
            Elements optionElms = choicesElm.select("li");
            optionElms.forEach(optElm -> q.getChoiceList().add(optElm.text()));

            Element detailsElm = choicesElm.nextElementSibling();
            Elements pElms = detailsElm.select("p");

            String answer = pElms.get(0).text();
            answer = answer.replaceAll("[ \\[,]]+", ""); // remove contents other than letters, like [],
            answer.chars().forEach(c -> q.getAnswerList().add((char)c));

            if(pElms.size() > 2) {  // which has comments
                pElms.remove(0);    // remove the answer p
                pElms.remove(0);    // remove the Explain: p
                pElms.forEach(pElm -> {
                    String text = pElm.html();
                    if(text.length() > 0) {
                        q.getCommentList().add(text);
                    }
                });
            }

            Set<String> catList = QuestionUtils.categorize(q);
            q.setCategories(catList);

            // check options sequence
            if(!checkOptions(q)){
                log.warn("Question {} - option sequence wrong", q.getQuestionNumber());
            }
        });
        return qList;
    }

    private static boolean checkOptions(Question q) {
        char[] expected = {'A', 'B', 'C', 'D', 'E', 'F', 'G', };
        for (int i=0; i<q.getChoiceList().size(); i++) {
            String s = q.getChoiceList().get(i);
            if (s.charAt(0) != expected[i]) {
                return false;
            }
        }
        return true;
    }

    public static void convertJsonToMarkdown(Path jsonPath, Path mdPath) throws IOException {
        byte[] buf = Files.readAllBytes(jsonPath);
        String json = new String(buf);
        List<Question> list = gson.fromJson(json, new TypeToken<List<Question>>(){}.getType());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<list.size(); i++){
            Question q = list.get(i);
            String md = questionToMarkdown(q);
            sb.append(md);
        }
        Files.write(mdPath, sb.toString().getBytes());
    }

    public static String questionToMarkdown(Question q) {
        StringBuilder sb = new StringBuilder();
        sb.append("### Question ").append(q.getQuestionNumber()).append(":\n\n");
        sb.append(q.getText()).append("\n\n");
        List<String> choiceList = q.getChoiceList();
        for (String choice : choiceList) {
            sb.append("- ").append(choice).append("\n");
        }
        sb.append("\n");
        sb.append("<details><summary>Answer:</summary><p>\n");
        sb.append(q.getAnswerList().toString()).append("\n\n");
        sb.append(q.getCategories().toString()).append("\n\n");
        sb.append("Explanation:\n\n");
        List<String> commentList = q.getCommentList();
        for(String comment:commentList){
            sb.append(comment).append("\n\n");
        }
        sb.append("</p></details><hr>\n\n");
        return sb.toString();
    }

}
