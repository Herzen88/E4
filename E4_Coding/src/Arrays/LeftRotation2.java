package Arrays;


import java.util.Arrays;

public class LeftRotation2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int d = 4;
        Arrays.stream(rotate(array,d)).forEach(s ->System.out.print(s + " "));
    }

    public static int[] rotate(int[] array, int d) {
        int temp;
        while (d > 0) {
            temp = array[0];
            for (int i = 1; i < array.length; i++) {
                array[i-1]=array[i];
            }
            array[array.length-1]=temp;
            d--;
        }

        return array;
    }
}