package algo.aws.questions;

import algo.aws.questions.passleader.PassLeaderUtils;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Log4j2
public class PassLeaderUtilsTests {
    @Test
    public void testSplitWords() throws IOException {
        byte[] buf = Files.readAllBytes(Paths.get("q/aws-devop-pro.md"));
        String s = new String(buf);
        Map<String, Integer> map = PassLeaderUtils.buildWordMap(s);
        List<Entry<String, Integer>> list = PassLeaderUtils.sortWordEntrys(map);
        log.info(list.size());
        List<String> dict = list.stream()
                .filter(entry -> entry.getValue() > 3)
                .map(Entry::getKey)
                .filter(s1 -> s1.matches("[A-Za-z0-9]+"))
                .filter(s1 -> s1.length() < 20)
                .collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        for(String word:dict){
            sb.append(word).append("\n");
        }
        Files.write(Paths.get("q/aws-devop-pro-new.dict"), sb.toString().getBytes());

        Pattern pattern = Pattern.compile("([a-zA-Z0-9]{20,})");
        StringBuilder sb1 = new StringBuilder(s);
        Matcher matcher = pattern.matcher(sb1);
        while(matcher.find()){
            String sub = sb1.substring(matcher.start(), matcher.end());
            log.debug(sub);
        }

        String sentence = "capturedinthesameregionastowhichtheAPIcallismadeandprocessedanddelivered";
        log.info(sentence);
        sentence = PassLeaderUtils.makeSentence(sentence, dict);
        log.info(sentence);
    }

    @Test
    public void testSplitWords1() throws IOException {
        byte[] buf = Files.readAllBytes(Paths.get("q/aws-devop-pro.md"));
        String s = new String(buf);

        List<String> dict = Files.readAllLines(Paths.get("q/aws-devop-pro.dict"));

        Pattern pattern = Pattern.compile("([a-zA-Z0-9]{20,})");
        StringBuilder sb1 = new StringBuilder(s);
        Matcher matcher = pattern.matcher(sb1);
        while(matcher.find()){
            String sub = sb1.substring(matcher.start(), matcher.end());
            log.debug(sub);
            String fixed = PassLeaderUtils.makeSentence(sub, dict);
            log.info(fixed);
            sb1.replace(matcher.start(), matcher.end(), fixed);
        }
        Files.write(Paths.get("q/aws-devop-pro.md"), sb1.toString().getBytes());
    }
}
