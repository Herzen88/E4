package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//int[], int x, find pair where sum == X
public class ArrayPairX {
    public static void main(String[] args) {
        int[] arrayTest = new int[]{2, 6, 9, 1, 5};
        int product=0;

        for(int i=0; i<=arrayTest.length/2;i++){
         if(product<arrayTest[i]*arrayTest[arrayTest.length-1-i]){
             product=arrayTest[i]*arrayTest[arrayTest.length-1-i];
         }
        }
        System.out.println(product);
    }

}
