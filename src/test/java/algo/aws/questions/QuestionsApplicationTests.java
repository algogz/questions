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
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class QuestionsApplicationTests {
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Test
    public void buildQuestionRepository() throws IOException {
        QuestionRepository repo = new QuestionRepository("q/sap/aws-sap-full.json");
        Path path = Paths.get("jayendrapatil/json/professional-questions.json");
        List<Question> qList = QuestionUtils.readQuestions(path);
        qList.forEach(q -> {
            if(!repo.hasSimilar(q)){
                repo.add(q);
            }
        });
        repo.save();
    }

    @Test
    public void findSimilarQuestions() throws IOException {
        QuestionRepository repo = new QuestionRepository("q/dop/aws-devop-pro-full.json");
        Path pathJayen = Paths.get("jayendrapatil/json/professional-questions.json");
        List<Question> jayenList = QuestionUtils.readQuestions(pathJayen);
        jayenList.forEach(q -> {
            List<Question> similarList = repo.findSimilar(q);
            if(similarList.size()>0) {
                int[] similars = similarList
                        .stream()
                        .mapToInt(q1 -> q1.getQuestionNumber())
                        .toArray();
                log.info("{}{} -> dop {}", q.getUrl(), q.getQuestionNumber(), similars);
            }
        });
    }

    @Test
    public void findSimilarQuestions1() throws IOException {
        String text = "You are creating a new API for video game scores. Reads are 100 times more common than writes, and the top 1% of scores are read 100 times more frequently than the rest of the scores. What’s the best design for this system, using \n" +
                "DynamoDB?";
        QuestionRepository repo = new QuestionRepository("q/dop/aws-devop-pro-full.json");
        List<Question> similarList = repo.findSimilar(text);
        int[] similars = similarList
                .stream()
                .mapToInt(q1 -> q1.getQuestionNumber())
                .toArray();
        log.info("Similar questions {}", similars);
    }

    @Test
    public void categorize() throws IOException {
        Path path = Paths.get("jayendrapatil/json/professional-questions.json");
        List<Question> qList = QuestionUtils.readQuestions(path);
        qList.forEach(q -> {
            Set<String> catList = QuestionUtils.categorize(q);
            q.setCategories(catList);
        });
        Files.write(path, gson.toJson(qList).getBytes());
    }

    @Test
    public void categorizeJsonInPath() throws IOException {
        Path path = Paths.get("jayendrapatil/json/service");

        for(Path jsonFile: Files.list(path).collect(Collectors.toList())){
            List<Question> qList = QuestionUtils.readQuestions(jsonFile);
            QuestionUtils.categorize(qList);
            Files.write(jsonFile, gson.toJson(qList).getBytes());
        }
    }
}
