package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaCollectionsTest {
    public static void main(String[] args) {

        //Map method
        int[] arr1 = new int[10];
        List<Integer> list1 = new ArrayList<>();

        fillList(list1);
        fillArray(arr1);

        arr1 = Arrays.stream(arr1).map(a -> a * 2).toArray();
        list1 = list1.stream().map(a -> a * 2).collect(Collectors.toList());
        arr1 = Arrays.stream(arr1).map(a -> 3).toArray();
        arr1 = Arrays.stream(arr1).map(a -> a + 1).toArray();

        System.out.println(list1);
        System.out.println(Arrays.toString(arr1));

        //Filter method
        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillList(list2);
        fillArray(arr2);

        arr2 = Arrays.stream(arr2).filter(a -> a % 2 == 0).toArray();
        list2= list2.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

        System.out.println(list2);
        System.out.println(Arrays.toString(arr2));

        //For each method
        Arrays.stream(arr2).forEach(System.out::println);
        list2.forEach(System.out::println);

        //Reduce method
        int[] arr3= new int[10];
        List<Integer> list3= new ArrayList<>();

        fillArray(arr3);
        fillList(list3);

        int sum1 = Arrays.stream(arr3).reduce((acc, b)->acc+b).getAsInt();
        int sum2 = list3.stream().reduce((acc,b)-> acc*b).get();

        System.out.println(sum1);
        System.out.println(sum2);

        int [] arr4 = new int[10];
        List<Integer> list4= new ArrayList<>();

        fillList(list4);
        fillArray(arr4);

        arr4 = Arrays.stream(arr4).filter(a->a%2!=0).map(a->a*4).toArray();
        list4 =list4.stream().filter(a->a%2!=0).map(a->a*4).collect(Collectors.toList());

        System.out.println(Arrays.toString(arr4));
        System.out.println(list4);

    }


    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }


    private static void fillArray(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
    }
}
