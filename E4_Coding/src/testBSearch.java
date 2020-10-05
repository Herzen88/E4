public class testBSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9};
        int target = 5;
        System.out.println(binarySearch(arr, target));

    }

    private static int binarySearch(int[] arr, int target) {
        int p, q, r;
        p = 0;
        r = arr.length - 1;
        while (p <= r) {
            q = Math.round((p+r)/2);
            if (arr[q] == target) return q;
            if (arr[q] > target) r = q - 1;
            else p = q + 1;
        }
        return -1;
    }
}