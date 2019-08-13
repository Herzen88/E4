package Arrays;

import java.util.Arrays;

public class CommonElementsSortedArrays {
    public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.

        int[] array1A = {1, 3, 4, 6, 7, 9};
        int[] array2A = {1, 2, 4, 5, 9, 10};
        // commonElements(array1A, array2A) should return [1, 4, 9] (an array).

        int[] array1B = {1, 2, 9, 10, 11, 12};
        int[] array2B = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};
        // commonElements(array1B, array2B) should return [1, 2, 9, 10, 12] (an array).

        int[] array1C = {0, 1, 2, 3, 4, 5};
        int[] array2C = {6, 7, 8, 9, 10, 11};
        // common_elements(array1C, array2C) should return [] (an empty array).
        Arrays.stream(commonElements(array1A, array2A)).forEach(System.out::print);
        System.out.println("");
        Arrays.stream(commonElements(array1B, array2B)).forEach(System.out::print);
        Arrays.stream(commonElements(array1C, array2C)).forEach(System.out::print);
    }

    // Implement your solution below.
    // NOTE: Remember to return an Integer array, not an int array.
    public static Integer[] commonElements(int[] array1, int[] array2) {
        Integer[] resultInArray = new Integer[array1.length];
        int c = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) resultInArray[c++] = array1[i];
            }
        }
        resultInArray = Arrays.stream(resultInArray)
                .filter(i -> (i != null && i > 0))
                .toArray(Integer[]::new);


        return resultInArray;
    }
}
