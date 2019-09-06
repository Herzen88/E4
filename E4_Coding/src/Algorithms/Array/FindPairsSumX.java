package Algorithms.Array;

import java.util.HashMap;
import java.util.Map;

public class FindPairsSumX {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 7, 8, 9};
        int x = 9;
        System.out.println(findPairs(arr, x).toString());
    }

    public static Map<Integer, Integer> findPairs(int[] arr, int sum) {
        Map<Integer, Integer> resultMap = new HashMap<>();
        int aAddition;
        int bAddition;

        for (int i = 0; i < arr.length; i++) {
            aAddition=arr[i];
            bAddition=sum-arr[i];
            if(aAddition+bAddition==sum) resultMap.put(aAddition,bAddition);
        }

        return resultMap;
    }
}
