package LeetCode.DoubleArrays;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpiralMatrix {
    public static void main(String[] args) {
        int [][] input = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(input));

    }
    private static List<Integer> spiralOrder(int[][] matrix) {

        int pos=0;
        int resultLength=matrix.length * matrix[0].length;
        int[] result= new int [resultLength];
        for (int i=0; i<matrix.length; i++){
            if(i%2==0) System.arraycopy(matrix[i], 0, result, pos, matrix[i].length);
            else
            {
                for (int j = matrix[i].length/2; j >=0; j--) {
                    int temp = matrix[i][j];
                    matrix[i][j]= matrix[i][matrix[i].length-1-j];
                    matrix[i][matrix[i].length-1-j]=temp;
                }
                System.arraycopy(matrix[i], 0, result, pos, matrix[i].length);
            }
            pos+=matrix[i].length;
        }
        return Arrays.stream(result).boxed().collect(Collectors.toList()) ;
    }
}
