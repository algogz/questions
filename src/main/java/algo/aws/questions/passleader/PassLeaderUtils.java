package algo.aws.questions.passleader;

import lombok.extern.log4j.Log4j2;

import java.util.*;
import java.util.function.Consumer;

@Log4j2
public class PassLeaderUtils {
    public static Map<String, Integer> buildWordMap(String s){
        String[] tokens = s.split("[ ,.\n]+");
        Map<String, Integer> map = new HashMap<>();
        Arrays.asList(tokens).forEach(token -> {
            Integer count = map.get(token);
            if(null == count) {
                count = 0;
            }
            map.put(token, ++count);
        });

        return map;
    }

    public static List<Map.Entry<String, Integer>> sortWordEntrys(Map<String, Integer> map){
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(set);
        list.sort((o1, o2) -> {
            if (o1.getKey().length() > o2.getKey().length()) {
                return -1;
            } else if (o1.getKey().length() < o2.getKey().length()) {
                return 1;
            }
            return 0;
        });
        return list;
    }

    public static String makeSentence(String sentence, List<String> dict){
        StringBuilder sb = new StringBuilder(sentence);
        int idx = 0;
        while(idx < sb.length()){
            int len = findDict(sb, idx, dict);
            sb.insert(idx + len, ' ');
            idx += len + 1;
        }
        return sb.toString();
    }

    private static int findDict(StringBuilder sb, final int idx, List<String> dict) {
        for(int i=0; i<dict.size(); i++){
            String s = dict.get(i);
            int p = sb.indexOf(s, idx);
            if(p == idx){
                log.debug("hit [{}] at {}", s, i);
                return s.length();
            }
        }
        log.debug("hit nothing");
        return 1;
    }
}
