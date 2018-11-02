package algo.aws.questions;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class QuestionExtractorTests {
    @Test
    public void extractFromHtmlTest() throws IOException {
        String path = "temp/acloud-saa-test2.html";
        Document doc = Jsoup.parse(new File(path), "utf-8");
        Elements formElms = doc.select("form");
        StringBuilder sb = new StringBuilder();
        for (Element formElm : formElms) {
            String qNumber = formElm.select("div.quiz-question--header--hkqKL > span:nth-child(1)").text();
            if(qNumber.isEmpty()) { // in case there is a leading star
                qNumber = formElm.select("div.quiz-question--header--hkqKL > span:nth-child(2)").text();
            }
            String qDesc = formElm.select("#question-prompt").text();
            System.out.println(qNumber);
            sb.append("### ").append(qNumber).append("\n\n");
            sb.append(qDesc).append("\n\n");

            Elements ulElms = formElm.select("ul");
            Elements optionElms = ulElms.get(0).select("li");
            String answer = "";
            int i = 0;
            for (i=0; i< optionElms.size(); i++) {
                Element optionElm = optionElms.get(i);
                String option = optionElm.text();
                char letter = (char)(65 + i);
                if(option.endsWith("(Correct)")){
                    answer += letter;
                    option = option.substring(0, option.length() - "(Correct)".length());
                } else if(option.endsWith("(Incorrect)")){
                    option = option.substring(0, option.length() - "(Incorrect)".length());
                }
                sb.append("- ").append(letter + ". " + option).append("\n");
            }
            sb.append("\n").append("<details><summary>Answer:</summary><p>").append("\n");
            sb.append(answer).append("\n\n");

            sb.append("Explanation:").append("\n\n");
            Elements explanationElms = formElm.select("div.quiz-question--explanation--1HS_E > div > ul > li");
            for (Element explanationElm : explanationElms) {
                String explanation = explanationElm.text();
                sb.append(explanation).append("\n\n");
            }
            sb.append("</p></details><hr>").append("\n\n");
        }

        Files.write(Paths.get(path.replaceFirst("\\.html", "\\.md")), sb.toString().getBytes());
    }

}
