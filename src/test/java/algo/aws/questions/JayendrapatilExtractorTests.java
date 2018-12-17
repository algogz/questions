package algo.aws.questions;

import algo.aws.questions.jayendrapatil.JayendrapatilUtils;
import algo.aws.questions.jayendrapatil.Question;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

@Log4j2
public class JayendrapatilExtractorTests {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Test
    public void testConvertToMarkdown() throws IOException {
        String baseDir = "jayendrapatil/";
        String module = "aws-api-gateway";
        Path jsonPath = Paths.get(baseDir, "json",module + ".json");
        Path mdPath = Paths.get(baseDir,"md", module + ".md");
        JayendrapatilUtils.convertToMarkdown(jsonPath, mdPath);
    }

    @Test
    public void testSaveAllHtml() throws IOException {
        JayendrapatilUtils.saveAllHtml(true);
    }

    @Test
    public void testSaveAllQuestions() throws IOException {
        JayendrapatilUtils.saveAllQuestions(true);
    }

    @Test
    public void saveAllProfessionalQuestions() throws IOException {
        JayendrapatilUtils.saveAllProfessionalQuestions();
    }

    @Test
    public void testRetrieveUrls() throws IOException {
        Map<String, String> urls = JayendrapatilUtils.retrieveUrls();
        log.info(gson.toJson(urls));
    }
    @Test
    public void testRetrieveQuestions() throws IOException {
//        String url = "http://jayendrapatil.com/aws-elastic-beanstalk/";
        String url = "http://jayendrapatil.com/aws-iam-role/";
        List<Question> questionList = JayendrapatilUtils.retrieveQuestions(url);

        log.info(gson.toJson(questionList));
    }
}
