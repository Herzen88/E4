package Arrays;

import java.util.Arrays;

public class LeftRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 4;
        System.out.println(Arrays.toString(rotateLeft(arr, x)));
    }

    public static int[] rotateLeft(int[] arr, int x) {
        int n = 3;

        for (int i = 0; i < n; i++) {
            int j, first;
            first = arr[0];
            for (j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = first;
        }
        return arr;
    }

}

