package LeetCode.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;

        System.out.println(Arrays.toString(compareTwoSum(nums, target)));
    }

    private static int[] compareTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int subtractor = target - nums[i];
            if (map.containsKey(subtractor)) {
                return new int[]{map.get(subtractor), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
