package Arrays;

import java.util.Arrays;

//int[], int x, find pair where sum == X
public class ArrayPairX {
    public static void main(String[] args) {
        int[] arrayTest = new int[]{2, 6, 9, 1, 5};

        System.out.println(oldMethod(arrayTest));
        System.out.println(newMethod(arrayTest));
        System.out.println(stackOverFlowMethod(arrayTest));
    }

    public static int oldMethod(int[] arr) {
        int product = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]*arr[j]>product&&arr[i]!=arr[j])product=arr[i]*arr[j];
            }
        }
        return product;
    }

    public static int newMethod(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1] * arr[arr.length - 2];
    }

    public static int stackOverFlowMethod(int[] a) {
        int n = a.length;
        int max = -1;
        if (n < 2) return -1;
        int largest_so_far = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] < largest_so_far) {
                // candidate for left value
                if (a[i] * largest_so_far > max) max = a[i] * largest_so_far;
            } else {
                // candidate for right value
                largest_so_far = a[i];
            }
        }
        return max;
    }
}
