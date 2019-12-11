package Arrays;

import java.util.Arrays;

public class LeftRotation3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int d = 4;
        Arrays.stream(rotateArrayToLeft(a, d)).forEach(System.out::print);
    }

    public static int[] rotateArrayToLeft(int[] a, int d) {
        while (d > 0) {
            int temp = a[0];
            for (int i = 1; i < a.length; i++) {
                a[i - 1] = a[i];
            }
            a[a.length - 1] = temp;
            d--;
        }
        return a;
    }
}
