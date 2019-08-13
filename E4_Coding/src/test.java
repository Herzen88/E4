import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] ar = {2, 5, 5, 5, 4, 2, 1};
        int sum = 0;
        Arrays.sort(ar);
        for (int i = ar.length - 1; i > 0; i--) {
            if (i == ar.length - 1) sum++;
            else if (ar[i] == ar[i + 1])sum++;
            else break;
        }
        System.out.println(sum);
    }
}