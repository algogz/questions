package algo.aws.questions;

import algo.aws.questions.freecram.FreeCramUtils;
import algo.aws.questions.jayendrapatil.Question;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.log4j.Log4j2;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Map;

@Log4j2
public class FreeCramUtilsTests {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Test
    public void retrieveUrls() throws IOException {
        Map<String, String> map = FreeCramUtils.retrieveUrls();
        log.info(map);
    }

    @Test
    public void saveAllHtml() throws IOException {
        FreeCramUtils.downloadAllHtml(true);
    }

    @Test
    public void retrieveQuestionFromHtml() throws IOException {
        Document doc = Jsoup.parse(new File("freecram/html/question-3.html"), "utf-8");
        Question question = FreeCramUtils.retrieveQuestionFromHtml(doc, null);
        log.info(gson.toJson(question));
    }

    @Test
    public void allHtml2Json() throws IOException {
        FreeCramUtils.allHtml2Json();
    }

    @Test
    public void convertJsonToMarkdown() throws IOException {
        FreeCramUtils.convertJsonToMarkdown();
    }
}
