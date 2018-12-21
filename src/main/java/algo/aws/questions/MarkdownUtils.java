package algo.aws.questions;

import algo.aws.questions.jayendrapatil.Question;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownUtils {
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void convertToMarkdown(Path jsonPath, Path mdPath) throws IOException {
        byte[] buf = Files.readAllBytes(jsonPath);
        String json = new String(buf);
        List<Question> list = gson.fromJson(json, new TypeToken<List<Question>>(){}.getType());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<list.size(); i++){
            Question q = list.get(i);
            sb.append("### Question ").append(i+1).append(":\n\n");
            sb.append(q.getText()).append("\n\n");
            List<String> choiceList = q.getChoiceList();
            for (String choice : choiceList) {
                sb.append("- ").append(choice).append("\n");
            }
            sb.append("\n");
            sb.append("<details><summary>Answer:</summary><p>\n");
            sb.append(q.getAnswerList().toString()).append("\n\n");
            sb.append("Explanation:\n\n");
            List<String> commentList = q.getCommentList();
            for(String comment:commentList){
                sb.append(comment).append("\n\n");
            }
            sb.append("</p></details><hr>\n\n");
        }
        Files.write(mdPath, sb.toString().getBytes());
    }

}
