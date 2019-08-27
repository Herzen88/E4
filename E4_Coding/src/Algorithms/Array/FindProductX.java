package Algorithms.Array;

import java.util.*;

public class FindProductX {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5, 6};
        int x = 12;
//        System.out.println(findPairs(a, x).toString());
//        System.out.println(findPairsGood(a, x).toString());
        System.out.println(findPairsGoodIndex(a, x).toString());
//        System.out.println(findLMaxProduct(a));
//        System.out.println(findLMaxProductGood(a));
    }

    public static Map<Integer, Integer> findPairs(Integer[] a, int x) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = Arrays.asList(a);
        for (int i = 0; i < a.length; i++) {
            if (list.contains(x / a[i]) && x / a[i] * a[i] == x) map.put(a[i], x / a[i]);
        }
        return map;
    }

    public static Map<Integer, Integer> findPairsGood(Integer[] arr, int x) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int b = x / a;
            if (x % a == 0) {
                if (list.contains(b)) {
                    map.put(a,b);
                } else list.add(a);
            }
        }
        return map;
    }

    public static Map<Integer, Integer> findPairsGoodIndex(Integer[] arr, int x) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int b = x / a;
            if (x % a == 0) {
                if (list.contains(Arrays.asList(arr).indexOf(b))) {
                    map.put(i,Arrays.asList(arr).indexOf(b));
                } else list.add(i);
            }
        }
        return map;
    }

    public static int findLMaxProduct(Integer[] a) {
        Arrays.sort(a);
        return a[a.length - 1] * a[a.length - 2];
    }


    public static int findLMaxProductGood(Integer[] a) {
        int max1 = 0;
        int max2 = Integer.MIN_VALUE;

        int min1 = 0;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2) {
                max2 = a[i];
            }

            if (a[i] < min1) {
                min2 = min1;
                min1 = a[i];
            } else if (a[i] < min2) {
                min2 = a[i];
            }
        }
        if (max1 * max2 > min1 * min2) {
            return max1 * max2;
        } else return min1 * min2;
    }

}

