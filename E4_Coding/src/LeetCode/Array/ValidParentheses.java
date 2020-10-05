package LeetCode.Array;

import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "[{}]";
        System.out.println(isValid(s));
    }

    private static boolean isValid(String s){
        char[] array = s.toCharArray();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            map.put(String.valueOf(array[i]),i);
        }



        return true;
    }
}
