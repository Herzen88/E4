package com.company.Algorithms;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "Let's take LeetCode contest";
        String output = "";
        StringBuilder builder = new StringBuilder(input);

        input = builder.reverse().toString();

        String[] strArray = input.split("\\s");
        for (int i = strArray.length - 1; i > -1; i--) {
            if (i > 0) output += strArray[i] + " ";
            else output += strArray[i];
        }
        System.out.println(output);
    }
}
