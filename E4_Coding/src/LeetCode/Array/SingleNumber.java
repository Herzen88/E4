package LeetCode.Array;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {-1, -1, -2};
        System.out.println(getSingleNumber(nums));
    }

    private static int getSingleNumber(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
             map.put(nums[i], (map.getOrDefault(nums[i], 0) + 1));
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue()==1) return entry.getKey();
        }

        return -1;
    }
}
