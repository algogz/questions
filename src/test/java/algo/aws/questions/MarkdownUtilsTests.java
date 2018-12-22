package algo.aws.questions;

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

@Log4j2
public class MarkdownUtilsTests {
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Test
    public void convertMarkdownPageToJson() throws IOException {
        String mdPageUrl = "https://github.com/algogz/questions/blob/master/q/dop/aws-devop-pro-part2.md";
        Path jsonFile = Paths.get("q/dop/aws-devop-pro-part2.json");
        List<Question> qList = MarkdownUtils.convertMarkdownPageToJson(mdPageUrl, jsonFile);
        Files.write(jsonFile, gson.toJson(qList).getBytes());
    }

}
