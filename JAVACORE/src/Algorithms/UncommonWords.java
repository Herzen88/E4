package Algorithms;


import java.util.*;

public class UncommonWords {
    public static void main(String[] args) {
        String a = "this apple apple is sweet";
        String b = "this apple is sour";
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(a.split(" ")));
        list.addAll(Arrays.asList(b.split(" ")));
        Set<String> commonWords = new HashSet<>();
        Set<String> uncommonWords = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
            for (int j = ++i; j < list.size()-1; j++) {
                System.out.println("I: "+list.get(i) + " J: " + list.get(j));
                if (list.get(i).equals(list.get(j))) {
                    commonWords.add(list.get(i));
                }
            }
        }
        list.removeAll(commonWords);
        uncommonWords.addAll(list);
        System.out.println(uncommonWords);
    }
}

