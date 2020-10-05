package LeetCode.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayEasy {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1,2,2,3,3,4};
//        System.out.println(countDuplicates(arr));
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] A) {
        if (A.length == 0) return 0;
        int j = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != A[j]) A[++j] = A[i];
            System.out.println(Arrays.toString(A));
        }
        System.out.println(Arrays.toString(A));
        return ++j;
    }

    private static int countDuplicates(int[] arr){
        int count=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==arr[i-1]){
                count++;
            } else {
                arr[i-1]=arr[i];
            }
        }
        return count;
    }
}
