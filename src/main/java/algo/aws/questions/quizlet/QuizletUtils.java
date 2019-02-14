package algo.aws.questions.quizlet;

import algo.aws.questions.MarkdownUtils;
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

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Log4j2
public class QuizletUtils {
    static ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    static String baseDir = "quizlet/";

    public static void extractQuestions(String htmlPath) throws IOException, ScriptException {
        File htmlFile = new File(htmlPath);
        Document doc = Jsoup.parse(htmlFile, "utf-8");
        Elements elms = doc.select("script");
        for(Element elm:elms){
            String script = elm.html();
            if(script.contains("setPageData")) {
                script = script.replace("window.Quizlet.setPageData", "pageData");
                int idx = script.indexOf("QLoad");
                script = script.substring(0, idx);
                engine.eval(script);
                Map pageData = (Map)engine.get("pageData");
                Map termIdToTermsMap = (Map)pageData.get("termIdToTermsMap");
                List<QuizletItem> questions = new ArrayList<>();
                termIdToTermsMap.forEach((k, v) -> {
                    Map<String, String> item = (Map)v;
                    questions.add(new QuizletItem(item.get("word"), item.get("definition")));
                });
                System.out.println(gson.toJson(questions));
                convertQuestionsToMarkdown(questions, Paths.get(baseDir, "md",
                        htmlFile.getName().replaceAll("html", "md")));
            }
        }
    }


    public static void convertQuestionsToMarkdown(List<QuizletItem> questions, Path mdPath) throws IOException {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<questions.size(); i++){
            QuizletItem q = questions.get(i);
            String md = questionToMarkdown(i+1, q);
            sb.append(md);
        }
        Files.write(mdPath, sb.toString().getBytes());
    }

    public static String questionToMarkdown(int index, QuizletItem q) {
        StringBuilder sb = new StringBuilder();
        sb.append("### Question ").append(index).append("\n\n");
        sb.append(q.getText().replaceAll(" *\\[ *]", "- ")).append("\n\n");
        sb.append("\n");
        sb.append("<details><summary>Answer:</summary><p>\n");
        sb.append(q.getAnswer().replaceAll("\\n", "\n\n")).append("\n\n");
        sb.append("</p></details><hr>\n\n");
        return sb.toString();
    }
}
