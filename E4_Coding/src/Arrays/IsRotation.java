package Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class IsRotation {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2a = {4, 5, 6, 7, 8, 1, 2, 3};
        // isRotation(array1, array2a) should return false.
        int[] array2b = {4, 5, 6, 7, 1, 2, 3};
        // isRotation(array1, array2b) should return true.
        int[] array2c = {4, 5, 6, 9, 1, 2, 3};
        // isRotation(array1, array2c) should return false.
        int[] array2d = {4, 6, 5, 7, 1, 2, 3};
        // isRotation(array1, array2d) should return false.
        int[] array2e = {4, 5, 6, 7, 0, 2, 3};
        // isRotation(array1, array2e) should return false.
        int[] array2f = {1, 2, 3, 4, 5, 6, 7};
        // isRotation(array1, array2f) should return true.
        System.out.println(isRotation(array1, array2a));
        System.out.println(isRotation(array1, array2b));
        System.out.println(isRotation(array1, array2c));
        System.out.println(isRotation(array1, array2d));
        System.out.println(isRotation(array1, array2e));
        System.out.println(isRotation(array1, array2f));
    }

    // Implement your solution below.
    public static Boolean isRotation(int[] array1, int[] array2) {
        int c = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array1[0] == array2[i]) c = i;
        }
        List<Integer> list = Arrays.stream(array2)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> tempList = new ArrayList<>();
        for (int i = list.size() - 1; i >= c; i--) {
            tempList.add(list.get(i));
        }
        Collections.reverse(tempList);
        list = list.subList(0, c);
        tempList.addAll(list);
        array2 = tempList.stream().mapToInt(i -> i).toArray();

        if (Arrays.equals(array1, array2)) return true;
        return false;
    }
}
