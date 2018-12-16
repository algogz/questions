package algo.aws.questions.jayendrapatil;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Question {
    String url;
    int questionNumber;
    boolean isProfessional;
    String text;
    List<String> choiceList = new ArrayList<>();
    List<Character> answerList = new ArrayList<>();
    List<String> commentList = new ArrayList<>();

    public Question(String url, int questionNumber, String text) {
        this.url = url;
        this.questionNumber = questionNumber;
        this.text = text;
    }
}
