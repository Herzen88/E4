package LeetCode.Array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums ={0,4,5,0,3,6};
        System.out.println(isDuplicate(nums));
    }

    private static boolean isDuplicate(int[] nums){
        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++){
            if(!set.add(nums[i])) return true;
        }
        return false;
    }

}
