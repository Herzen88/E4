package Algorithms.String;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NoRepeating {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        System.out.println(nonRepeating("abcab"));
        System.out.println(nonRepeating("abab"));
        System.out.println(nonRepeating("aabbbc"));
        System.out.println(nonRepeating("aabbdbc"));
    }

    // Implement your solution below.
    public static Character nonRepeating(String s) {
        Map<String, Integer> map = new LinkedHashMap<>();

        char[] cr = s.toCharArray();

        for (char it : cr) {
            if (map.containsKey(String.valueOf(it))) {
                map.put(String.valueOf(it), map.get(String.valueOf(it)) + 1);
            } else map.put(String.valueOf(it), 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1)) return entry.getKey().charAt(0);
        }
        return null;
    }
}
