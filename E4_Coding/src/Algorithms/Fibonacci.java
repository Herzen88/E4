package Algorithms;

public class Fibonacci {
    public static void main(String[] args) {
        long[] fibSequence = createFibonacciSequence(100);
        System.out.println(getFibonacciNumber(fibSequence, 12));
    }

    private static long getFibonacciNumber(long[] ar, int n) {
        long fibNumb = 0;
        for (int i = 0; i < ar.length; i++) {
            if (n == 0) fibNumb = 0;
            else if (n == 1) fibNumb = 1;
            else fibNumb = ar[n - 1] + ar[n - 2];
        }
        return fibNumb;
    }

    private static long[] createFibonacciSequence(int n){
        long[] ar = new long[n];
        ar[0]=1;
        ar[1]=1;
        for (int i = 2; i <ar.length; i++) {
            ar[i]=ar[i-1]+ar[i-2];
        }
        return ar;
    }
}
