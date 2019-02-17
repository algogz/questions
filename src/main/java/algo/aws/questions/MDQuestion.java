package algo.aws.questions;

import lombok.Data;

@Data
public class MDQuestion {
    String id;
    String text;
    String question;

    public MDQuestion(String text){
        int index = text.indexOf("\n");
        this.text = text.substring(index).trim();
        index = this.text.indexOf("\n- ");
        this.question = this.text.substring(0, index).trim();
        this.id = StringUtils.buildId(this.question);
    }
}
