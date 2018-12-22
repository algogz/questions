package algo.aws.questions;

import algo.aws.questions.jayendrapatil.Question;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class QuestionsApplicationTests {
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Test
    public void buildQuestionRepository() throws IOException {
        QuestionRepository repo = new QuestionRepository("q/sap/aws-sap-full.json");
        byte[] buf = Files.readAllBytes(Paths.get("jayendrapatil/json/professional-questions.json"));
        String json = new String(buf);
        List<Question> qList = gson.fromJson(json, new TypeToken<List<Question>>(){}.getType());
        qList.forEach(q -> {
            if(!repo.hasSimilar(q)){
                repo.add(q);
            }
        });
        repo.save();
    }

    @Test
    public void categorize() throws IOException {
        Path path = Paths.get("jayendrapatil/json/professional-questions.json");
        byte[] buf = Files.readAllBytes(path);
        String json = new String(buf);
        List<Question> qList = gson.fromJson(json, new TypeToken<List<Question>>(){}.getType());
        qList.forEach(q -> {
            Set<String> catList = QuestionUtils.categorize(q);
            q.setCategories(catList);
        });
        Files.write(path, gson.toJson(qList).getBytes());
    }
}
