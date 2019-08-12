import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int [] arr = {3,1,7,9,9,5};
        int temp=0;

        for (int i = arr.length-1; i > 0 ; i--) {
            for (int j = 1; j <= i ; j++) {
                if(arr[j]>arr[j-1]) {
                    temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }

        Arrays.stream(arr).forEach(System.out::print);
    }
}
