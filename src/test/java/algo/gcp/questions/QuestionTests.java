package algo.gcp.questions;

import algo.aws.questions.MDQuestionRepository;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class QuestionTests {
    @Test
    public void addId() throws IOException {
        Path path = Paths.get("quizlet/md/pca-wjscott-04.md");
        MDQuestionRepository repo = new MDQuestionRepository(path);

        System.out.println(repo.getQuestionList().size());
        repo.save();
    }

    @Test
    public void mdQuestionRepositoryTest() throws IOException {
        Path path = Paths.get("quizlet/md/pca-wjscott-04.md");
        MDQuestionRepository repo = new MDQuestionRepository(path);
        Path full = Paths.get("quizlet/md/pca-wjscott-full.md");
        MDQuestionRepository fullRepo = new MDQuestionRepository(full);

        repo.getQuestionList().forEach(q -> {
            if(!fullRepo.hasSimilar(q)){
                fullRepo.add(q);
            }
        });

        System.out.println(repo.getQuestionList().size());
        fullRepo.save();
    }
}
