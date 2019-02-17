package algo.aws.questions;

import java.util.*;
import java.util.stream.Stream;

public class StringUtils {
    /**
     * Compare similarity with 2 strings
     *
     * @param s1
     * @param s2
     * @return a value between 0 to 1, the higher the similar
     */
    public static double similarity(String s1, String s2){
        // build word count maps from the strings
        Map<String, Integer> s1map = buildWordCountMap(s1.toLowerCase());
        Map<String, Integer> s2map = buildWordCountMap(s2.toLowerCase());

        // make sure s1map has the most items
        if(s1map.size() < s2map.size()) {
            Map<String, Integer> map = s1map;
            s1map = s2map;
            s2map = map;
        }

        // compare all map items for the score
        List<Double> scoreList = new ArrayList<>(s1map.size());
        for(String k1:s1map.keySet()){
            Integer v1 = s1map.get(k1);
            Integer v2 = s2map.get(k1);
            if(null == v2) v2 = 0;  // avoid null pointer

            double score =(double)v2 / (double) v1;
            scoreList.add(score);
        }

        // calculate average score of all the items
        OptionalDouble avg = scoreList.stream().mapToDouble(a -> a).average();
        return avg.getAsDouble();
    }

    private static String splitRegex = "[ ,.\t\n\\(\\)]+";

    public static Map<String, Integer> buildWordCountMap(String s) {
        Map<String, Integer> map = new HashMap<>();
        if(null == s) return map;

        String[] words = s.split(splitRegex);
        Stream.of(words).forEach(word -> {
            Integer count = map.get(word);
            if(null == count) {
                count = 0;
            }
            map.put(word, ++count);
        });
        return map;
    }

    /**
     * Build the id by wordCountMap
     *
     * @param text
     * @return
     */
    public static String buildId(String text) {
        String[] words = text.split(splitRegex);
        StringBuilder sb = new StringBuilder();
        Stream.of(words).forEach(word -> sb.append(word.charAt(0)));
        String id = sb.toString().toLowerCase();
        if(id.length()>10) id = id.substring(0, 20);

        return id;
    }
}
