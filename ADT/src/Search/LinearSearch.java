package Search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int x = 5;
        System.out.println(findItemByValue(arr, x));
    }

    public static int findItemByValue(int[] arr, int x) {
        int answer = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) answer = i;
        }
        return answer;
    }
}
