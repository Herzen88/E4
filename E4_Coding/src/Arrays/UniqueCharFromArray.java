package Arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class UniqueCharFromArray {
    public static void main(String[] args) {
        String s = "XXAFAKK";
        returnUniqueChar(s);
    }

    public static void returnUniqueChar(String s) {
        char[] ar = s.toCharArray();
        for (int i = 0; i < ar.length; i++) {
          if(s.contains(String.valueOf(ar[i]))){
              System.out.println(ar[i]);
          }
        }
    }
}
