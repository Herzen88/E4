package Strings;

import java.util.Arrays;

//Given s = "the sky is blue",
// return "blue is sky the".
public class ReverseWords {

    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.println(reverseWordsGood(str));
        System.out.println(reverseStringAndWordsGood(str));

    }

    private static String reverseWordsGood(String str) {
        String[] array = str.split(" ");
        String temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        return Arrays.toString(array);
    }

    private static String reverseStringAndWordsGood(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String[] array = sb.toString().split(" ");

        String temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        return Arrays.toString(array);
    }
}
