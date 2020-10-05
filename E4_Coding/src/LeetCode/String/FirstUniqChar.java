package LeetCode.String;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqChar {
    public static void main(String[] args) {
        String s = "dddccdbba";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        char[] chAr = s.toCharArray();
        int counter = 0;
        String result = "";
        Map<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < chAr.length; i++) {
            map.put(String.valueOf(chAr[i]), map.getOrDefault(String.valueOf(chAr[i]), 0) + 1);
        }
        System.out.println(map.toString());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result = entry.getKey();
                break;
            }
            counter++;
        }

        for (int i = 0; i < chAr.length; i++) {
            if (result.contains(String.valueOf(chAr[i]))) return i;
        }

        return -1;
    }
}
