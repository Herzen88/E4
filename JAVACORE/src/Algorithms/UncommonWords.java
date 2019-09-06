package Algorithms;


import java.util.*;

public class UncommonWords {
    public static void main(String[] args) {
        String a = "this apple apple is sweet";
        String b = "this apple is sour";
        System.out.println(uncommonFromSentences(a, b));
        System.out.println(Arrays.toString(uncommonFromSentencesGood(a, b)));
    }

    public static Set<String> uncommonFromSentences(String a, String b) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(a.split(" ")));
        list.addAll(Arrays.asList(b.split(" ")));
        Set<String> commonWords = new HashSet<>();
        Set<String> uncommonWords = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = ++i; j < list.size()-1; j++) {
                if (list.get(i).equals(list.get(j))) {
                    commonWords.add(list.get(i));
                }
            }
        }
        list.removeAll(commonWords);
        uncommonWords.addAll(list);
        return  uncommonWords;
    }

    public static String[] uncommonFromSentencesGood(String A, String B) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> a = new HashMap<>();
        for (String x: A.split(" ")) {
            a.put(x, a.getOrDefault(x, 0) + 1);
        }
        for (String x: B.split(" ")) {
            a.put(x, a.getOrDefault(x, 0) + 1);
        }
        for (String x: a.keySet()) {
            if (a.get(x) == 1) {
                result.add(x);
            }
        }
        return result.toArray(new String[0]);
    }
}

