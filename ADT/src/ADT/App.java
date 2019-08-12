package ADT;

import ADT.Stack;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        Stack stack = new Stack(str.length());
        char[] arr = str.toCharArray();
        str="";
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        while (!stack.isEmpty()) {
            str += stack.pop();
        }
        return str;
    }
}
