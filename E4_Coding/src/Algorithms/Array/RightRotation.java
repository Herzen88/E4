package Algorithms.Array;

import java.util.Arrays;

public class RightRotation {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int d = 4;
        Arrays.stream(rotateArrayToRight(a, d)).forEach(System.out::print);
    }

    public static int[] rotateArrayToRight(int[] a, int d) {
        while (d > 0) {
            int temp = a[a.length - 1];
            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i-1];
            }
            a[0] = temp;
            d--;
        }
        return a;
    }
}
