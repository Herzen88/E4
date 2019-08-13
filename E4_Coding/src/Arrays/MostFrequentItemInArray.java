package Arrays;

import java.util.Collections;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.stream.Stream;

public class MostFrequentItemInArray {
    public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.

        // mostFrequent(array1) should return 1.
        int[] array1 = {1, 3, 1, 3, 2, 1};
        // mostFrequent(array2) should return 3.
        int[] array2 = {3, 3, 1, 3, 2, 1};
        // mostFrequent(array3) should return null.
        int[] array3 = {};
        // mostFrequent(array4) should return 0.
        int[] array4 = {0};
        // mostFrequent(array5) should return -1.
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};
        System.out.println(mostFrequent(array1));
        System.out.println(mostFrequent(array2));
        System.out.println(mostFrequent(array3));
        System.out.println(mostFrequent(array4));
        System.out.println(mostFrequent(array5));
    }

    // Implement your solution below.
    public static Integer mostFrequent(int[] givenArray) {
        Integer maxItem = null;

        //For Each check if current element equals with next elements
        //Create Map<Integer, Integer> where key is array item and value is quantity of same items in array

        Map<Integer, Integer> map = new TreeMap<>();

        for (int i : givenArray) {
            if (!map.containsKey(i)) map.put(i, 1);
            else map.put(i, map.get(i) + 1);
        }

        Stream<Map.Entry<Integer, Integer>> sorted =
                map.entrySet().stream()
                        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));
        try {
            maxItem = sorted.findFirst().get().getKey();
        } catch (NoSuchElementException e) {
        }
        return maxItem;
    }
}
