package Strings;

//Rotate an array of n elements to the right by k steps.
//For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int rotationIndex = 3;

        Arrays.stream(rotateArray(array, rotationIndex)).forEach(System.out::print);
    }

    private static int[] rotateArray(int[] array, int rotationIndex) {
        int[] rotatedArray = new int[array.length];

        int j = rotationIndex-1;
        for (int i = array.length - 1; i > array.length - 1 - rotationIndex; i--) {
            rotatedArray[j] = array[i];
            j--;
        }

        for (int i = rotationIndex; i < array.length; i++) {
            rotatedArray[i]=array[i-rotationIndex];
        }


        return rotatedArray;
    }
}
