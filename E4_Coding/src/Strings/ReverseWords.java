package Strings;

import java.util.Arrays;

//Given s = "the sky is blue",
// return "blue is sky the".
public class ReverseWords {

    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.println(reverseWords(str));
    }

    private static String reverseWords(String str) {
        String[] array = str.split(" ");
        String[] temp = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            if(i==0){
                temp[i]=array[array.length-1];
                continue;
            }else if(i==array.length-1){
                temp[i]=array[0];
            } else
            temp[i]=array[i];
        }
        str= Arrays.toString(temp);
        return str;
    }
}
