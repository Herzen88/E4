package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ar = {1, 2, 5, 6, 3, 4};
        int temp = 0;

        for (int i = ar.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (ar[j] > ar[j + 1]) {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }

        Arrays.stream(ar).forEach(System.out::print);
    }
}
