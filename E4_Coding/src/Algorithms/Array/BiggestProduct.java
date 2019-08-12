package Algorithms.Array;

import java.util.Arrays;

public class BiggestProduct {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 8, 5, 5, 6, 7, 6, 9};
        System.out.println(returnPairOfBiggestProductLazy(ar));
        System.out.println(returnPairOfBiggestProductFast(ar));
    }

    private static int returnPairOfBiggestProductFast(int[] ar) {
        Arrays.sort(ar);
        return ar[ar.length - 1] * ar[ar.length - 2];
    }

    private static int returnPairOfBiggestProductLazy(int[] ar) {
        int maxProduct = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] * ar[j] > maxProduct && ar[i] != ar[j]) maxProduct = ar[i] * ar[j];
            }
        }
        return maxProduct;
    }
}
