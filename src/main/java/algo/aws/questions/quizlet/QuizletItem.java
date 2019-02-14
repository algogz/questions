package algo.aws.questions.quizlet;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class QuizletItem {
    private String text;
    private String answer;
}
