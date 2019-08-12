package Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        int x = 10;

        System.out.println(binarySearch(arr, x));
    }

    public static int binarySearch(int[] arr, int x) {
        int p, q, r;
        p = 0;
        r = arr.length - 1;
        while (p <= r) {
            q = Math.round((p + r) / 2);
            if (arr[q] == x) return q;
            if (arr[q] > x) r = q - 1;
            else p = q + 1;
        }
        return -1;
    }

}
