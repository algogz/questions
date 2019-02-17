package algo.aws.questions;

import algo.aws.questions.jayendrapatil.Question;
import lombok.Data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class MDQuestionRepository {
    Path path;
    String title = "# Default Title";
    List<MDQuestion> questionList = new ArrayList<>();

    public MDQuestionRepository(Path path) throws IOException {
        this.path = path;
        if(!Files.exists(path)) return;

        byte[] bytes = Files.readAllBytes(path);
        String mdText = new String(bytes);
        String parts[] = mdText.split("\\n### ");
        title = parts[0].trim();

        for(int i=1; i<parts.length; i++){
            System.out.println(i);
            MDQuestion q = new MDQuestion(parts[i]);
            questionList.add(q);
        }
    }

    public void save() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\n\n");
        int idx = 0;
        for (MDQuestion q : questionList) {
            sb.append("### QUESTION ").append(++idx).append(" (").append(q.getId()).append(")").append("\n\n");
            sb.append(q.getText()).append("\n\n");
        }
        Files.write(path, sb.toString().getBytes());
    }

    public void add(MDQuestion question){
        questionList.add(question);
    }

    public boolean hasSimilar(MDQuestion question){
        return questionList.stream()
                .mapToDouble(q -> StringUtils.similarity(q.getQuestion(), question.getQuestion()))
                .anyMatch(v -> v >= 0.9);
    }

    public List<MDQuestion> findSimilar(String text){
        return questionList.stream()
                .filter(q -> StringUtils.similarity(q.getQuestion(), text) >= 0.9)
                .collect(Collectors.toList());
    }

    public List<MDQuestion> findSimilar(MDQuestion question){
        return questionList.stream()
                .filter(q -> StringUtils.similarity(q.getQuestion(), question.getQuestion()) >= 0.9)
                .collect(Collectors.toList());
    }
}
