package algo.aws.questions;

import algo.aws.questions.jayendrapatil.Question;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class QuestionRepository {
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private Path path;
    List<Question> questionList = new ArrayList<>();

    public QuestionRepository(String file) throws IOException {
        path = Paths.get("file");
        if(Files.exists(path)){
            byte[] buf = Files.readAllBytes(path);
            String json = new String(buf);
            questionList = gson.fromJson(json, new TypeToken<List<Question>>(){}.getType());
        }
    }

    public void save() throws IOException {
        String json = gson.toJson(questionList);
        Files.write(path, json.getBytes());
    }

    public void add(Question question){
        questionList.add(question);
    }

    public boolean hasSimilar(Question question){
        return questionList.stream()
                .mapToDouble(q -> StringUtils.similarity(q.getText(), question.getText()))
                .anyMatch(v -> v >= 0.9);
    }
}
