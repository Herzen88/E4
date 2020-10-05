package LeetCode.Array;

import java.util.*;

public class TwoSumLessThanK {
    public static void main(String[] args) {
        int[] A = {254, 914, 110, 900, 147, 441, 209, 122, 571, 942, 136, 350, 160, 127, 178, 839, 201, 386, 462, 45, 735, 467, 153, 415, 875, 282, 204, 534, 639, 994, 284, 320, 865, 468, 1, 838, 275, 370, 295, 574, 309, 268, 415, 385, 786, 62, 359, 78, 854, 944};
        int K = 200;
        System.out.println(getTwoSumLessThanK(A, K));
    }

    private static int getTwoSumLessThanK(int[] A, int K) {
        int max=0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if(A[i]+A[j]<K){
                  if(max<A[i]+A[j]){
                      max=A[i]+A[j];
                  }
                }
            }
        }
        if(max>=K || max<1) return -1;
        return max;
    }
}
