package LeetCode.String;

public class StringInteger {

    public static void main(String[] args) {
        String input = "words -and -987";
        System.out.println(stringInt(input));
        System.exit(0);
    }

    private static int stringInt(String st) {

        StringBuilder ns = new StringBuilder();
        boolean isNegative = false;

        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == '-' && i + 1 < st.length() - 1 && Character
                    .isLetterOrDigit(st.charAt(i + 1)) && !Character
                    .isLetter(st.charAt(i + 1))) {
                isNegative = true;
            } else if (Character.isLetterOrDigit(st.charAt(i)) &&
                    !Character.isLetter(st.charAt(i))) {
                ns.append(st.charAt(i));
            }
        }
        if (isNegative) return 0 - Integer.valueOf(ns.toString());
        return Integer.valueOf(ns.toString());
    }
}
