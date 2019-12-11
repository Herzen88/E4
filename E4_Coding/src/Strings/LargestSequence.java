package Strings;

import java.util.HashMap;
import java.util.Map;

public class LargestSequence {
    public static void main(String[] args) {
        String sq = "AABBCCDDDDEEDDDDDDDDAADD";
        System.out.println(findLargestSequence(sq).toString());
    }

    private static Map<String, Integer> findLargestSequence(String sq) {
        Map<String, Integer> mapResult = new HashMap<>();
        String[] sqArr = sq.split("");
        String largestSqItem = null;
        String currentSqItem = null;
        int largestCount = 0;
        int count = 0;

        for (int i = 0; i < sqArr.length - 1; i++) {
            if (sqArr[i].equalsIgnoreCase(sqArr[i + 1])) {
                currentSqItem = sqArr[i];
                count++;
            } else {
                count = 0;
            }
            if (count > largestCount) {
                largestCount = count;
                largestSqItem = currentSqItem;
            }
        }
        mapResult.put(largestSqItem, largestCount);
        return mapResult;
    }
}
