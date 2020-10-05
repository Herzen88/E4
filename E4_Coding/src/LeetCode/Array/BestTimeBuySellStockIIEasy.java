package LeetCode.Array;

public class BestTimeBuySellStockIIEasy {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(getMoneyFromTradeGood(arr2));
    }

    private static int getMoneyFromTrade(int[] arr) {
        int stock = -1;
        int money = 0;

        for (int i = 1; i < arr.length; i++) {
            if (stock == -1 && arr[i - 1] < arr[i]) stock = arr[i - 1];
            if (stock != -1 && (stock < arr[i - 1] || stock < arr[i])) {
                if (arr[i - 1] <= arr[i] && i < arr.length - 1) continue;
                if (i == arr.length - 1 && arr[i - 1] < arr[i]) {
                    money += arr[i] - stock;
                } else {
                    money += arr[i - 1] - stock;
                    stock = -1;
                }

            }
        }
        return money;
    }

    private static int getMoneyFromTradeGood(int[] arr) {
        int localMin = 0;
        int localMax = 0;
        int globalMin = 0;
        int globalMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > localMax) localMax = arr[i];
            if (arr[i] < localMin) localMin = arr[i];
            if (localMax > globalMax) globalMax = localMax;
            if (localMin < globalMin) globalMin = localMin;
        }
        return globalMax - globalMin;
    }
}
