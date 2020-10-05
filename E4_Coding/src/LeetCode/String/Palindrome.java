package LeetCode.String;

public class Palindrome {
    public static void main(String[] args) {
        String s = "LooL ollo Lool";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        int first = 0;
        int last = s.length() - 1;

        char firstCh, lastCh;

        while (first <= last) {
            firstCh = s.charAt(first);
            lastCh = s.charAt(last);
            if (!Character.isLetterOrDigit(firstCh)) first++;
            else if (!Character.isLetterOrDigit(lastCh)) last--;
            else {
                if (Character.toLowerCase(firstCh) != Character.toLowerCase(lastCh)) return false;
                first++;
                last--;
            }
        }
        return true;
    }
}
