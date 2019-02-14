package algo.aws.questions;

import algo.aws.questions.quizlet.QuizletUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;

@Log4j2
public class QuizletUtilsTests {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Test
    public void retrieveQuestions() throws Exception {
        String path = "quizlet/html/pca-wjscott-04.html";
        QuizletUtils.extractQuestions(path);
    }

}
