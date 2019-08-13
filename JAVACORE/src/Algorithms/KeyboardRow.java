package com.company.Algorithms;

public class KeyboardRow {

    public static void main(String[] args) {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";
        String input = "fag lag pop mop kil";
        StringBuilder output = new StringBuilder();
        String[] strArray = input.split(" ");

        for (String str : strArray) {
            boolean isFirstRow = true;
            boolean isSecondRow = true;
            boolean isThirdRow = true;
            for (char c : str.toCharArray()) {
                if (!firstRow.contains(String.valueOf(c))) {
                    isFirstRow = false;
                }
                if (!secondRow.contains(String.valueOf(c))) {
                    isSecondRow = false;
                }
                if (!thirdRow.contains(String.valueOf(c))) {
                    isThirdRow = false;
                }
            }
            if (isFirstRow || isSecondRow || isThirdRow) {
                output.append(str).append(" ");
            }
        }
        System.out.println(output);
    }
}

