package LeetCode.String;

public class ReverseInt {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverseGood(-123));
    }

    private static int reverseGood(int x) {
        int length = Integer.toString(x).length();
        StringBuilder digit = new StringBuilder();
        boolean isMinus = x < 0;
        if (isMinus) length -= 1;

        while (length > 0) {
            digit.append(Math.abs(x % 10));
            x /= 10;
            length--;
        }
        int result;
        try {
            result = Integer.parseInt(digit.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
        if (isMinus) result *= -1;
        return result;
    }

    public static int reverse(int x) {
        boolean isNegative = x < 0;
        if (isNegative) x *= -1;

        String str = Integer.toString(x);
        char temp;
        char[] s = str.toCharArray();
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            if (s[s.length - 1] != 0) s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
        int result;
        try {
            result = Integer.parseInt(new String(s));
        } catch (NumberFormatException e) {
            return 0;
        }
        if (isNegative) result *= -1;
        return result;
    }
}
