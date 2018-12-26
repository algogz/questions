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
        QuestionRepository repo = new QuestionRepository("freecram/freecram-questions.json");
        Path pathJayen = Paths.get("jayendrapatil/json/professional-questions.json");
        List<Question> jayenList = QuestionUtils.readQuestions(pathJayen);
        jayenList.forEach(q -> {
            List<Question> similarList = repo.findSimilar(q);
            if(similarList.size()>0) {
                int[] similars = similarList
                        .stream()
                        .mapToInt(q1 -> q1.getQuestionNumber())
                        .toArray();
                log.info("{}{} -> freecram {}", q.getUrl(), q.getQuestionNumber(), similars);
            }
        });
    }

    @Test
    public void findSimilarQuestions1() throws IOException {
        String text = "You were just hired as a DevOps Engineer for a startup. Your startup uses AWS for 100% of their infrastructure. They currently have no automation at all for deployment, and they have had many failures while trying to deploy to production. \n" +
                "The company has told you deployment process risk mitigation is the most important thing now, and you have a lot of budget for tools and AWS resources. \n" +
                "Their stack: \n" +
                "2-tier API \n" +
                "Data stored in DynamoDB or S3, depending on type \n" +
                "Compute layer is EC2 in Auto Scaling Groups \n" +
                "They use Route53 for DNS pointing to an ELB \n" +
                "An ELB balances load across the EC2 instances \n" +
                "The scaling group properly varies between 4 and 12 EC2 servers. Which of the following approaches, given this company’s stack and their priorities, best meets the company’s needs?";
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
