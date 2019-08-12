package Algorithms.Array;

import java.util.HashMap;
import java.util.Map;

public class ArrayItemsMultiply {
    public static void main(String[] args) {
        System.out.println(returnPair());
    }

    private static Map<Integer,Integer> returnPair() {
        int[] ar = {3,4,-2,5,6};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            for (int j = 1; j < ar.length; j++) {
                if(ar[i] * ar[j] == 20){
                    map.put(i,j);
                }
                break;
            }
        }
        return map;
    }
}
