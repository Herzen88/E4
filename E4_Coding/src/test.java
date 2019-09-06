import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
    public static void main(String[] args) {
//        Integer[] array = {1, 2, 3, 4, 5, 6};
//        int expectedSum = 5;
//        Map<Integer, Integer> map = new HashMap<>();
//        List<Integer>  list = Arrays.asList(array);
//
//        for (int i = 0; i < array.length; i++) {
//            if(list.contains(expectedSum - array[i])){
//                map.put(array[i],expectedSum - array[i]);
//            }
//        }
//
        int[] arr = {1,2,4,6,5,7,8,9};
        System.out.println(findMissingItem(arr));

    }

    public static int findMissingItem(int[] arr){
        int totalSum=0;
        int missingSum=0;

        for (int i = 1; i <= arr[arr.length-1]; i++) {
            totalSum+=i;
        }
        for (int i = 0; i < arr.length; i++) {
            missingSum+=arr[i];
        }
        System.out.println(totalSum+" "+missingSum);
        if(totalSum-missingSum==0) return arr[arr.length-1]+1;
        return totalSum-missingSum;
    }
}