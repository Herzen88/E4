package Strings;

public class OneAwayStrings {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        System.out.println(isOneAway("abcde", "abcd"));
//        isOneAway("abde", "abcde");  // should return true
//        isOneAway("a", "a");  // should return true
//        isOneAway("abcdef", "abqdef");  // should return true
//        isOneAway("abcdef", "abccef");  // should return true
//        isOneAway("abcdef", "abcde");  // should return true
//        isOneAway("aaa", "abc");  // should return false
//        isOneAway("abcde", "abc");  // should return false
//        isOneAway("abc", "abcde");  // should return false
//        isOneAway("abc", "bcc");  // should return false
    }

    // Implement your solution below.
    public static Boolean isOneAway(String s1, String s2) {

        if (s1.equals(s2)) return true;
        else if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    if (s1.toCharArray()[i] != s2.toCharArray()[j]) {
                        if (s1.toCharArray()[i + 1] != s2.toCharArray()[j + 1]) {
                            return false;
                        } else continue;
                    }
                }
            }
        }
        return false;
    }
}

