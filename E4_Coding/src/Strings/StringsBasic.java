package Strings;

import java.awt.*;
import java.util.Arrays;

public class StringsBasic {
    public static void main(String[] args) {

      String[] str1 =  ("Long life is good!").split(" ");
      int max=-100;
        System.out.println(max);
          Arrays.stream(reverseString(str1)).forEach(System.out::print);

    }

    public static String[] reverseString(String[] str){
        String temp;
        for (int i = 0; i < (str.length-1)/2; i++) {
            temp=str[i];
            str[i]=str[str.length-1-i];
            str[str.length-1-i]=temp;
        }

       return str;
    }


    public static String getTextFromString(String str) {

        return str;
    }

    public static char[] stringToArray(String str) {


        return str.toCharArray();
    }


}
