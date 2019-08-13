package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] ar = {3, 2, 1, 6, 0, 9};
        int temp = 0;
        for (int i = 1; i < ar.length - 1; i++) {
            int j = i;

            while (j > 0 && ar[j] < ar[j - 1]) {
                temp = ar[j];
                ar[j] = ar[j - 1];
                ar[j - 1] = temp;
                j--;
            }
        }
        Arrays.stream(ar).forEach(System.out::print);
    }
}
