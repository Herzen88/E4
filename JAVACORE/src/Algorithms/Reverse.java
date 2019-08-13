package com.company.Algorithms;

public class Reverse {
    public static void main(String[] args) {
        String str = "hello";
        char[] array = str.toCharArray();
        String rv = "";
        for (int i = str.length()-1; i > -1; i--) {
            System.out.println(i);
            rv += array[i];
        }
        System.out.println(rv);
    }
}
