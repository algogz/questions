package algo.aws.questions.jayendrapatil;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class Question {
    String url;
    int questionNumber;
    public boolean isProfessional;
    String text;
    List<String> choiceList = new ArrayList<>();
    List<Character> answerList = new ArrayList<>();
    List<String> commentList = new ArrayList<>();
    Set<String> categories = new HashSet<>();

    public Question(String url, int questionNumber, String text) {
        this.url = url;
        this.questionNumber = questionNumber;
        this.text = text;
    }
}
