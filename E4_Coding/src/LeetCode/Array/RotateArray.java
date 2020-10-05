package LeetCode.Array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int k = 3;
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(rotateArray(nums, k)));
    }

    private static int[] rotateArray(int nums[], int k) {
        int temp = 0;
        while (0 < k) {
            temp = nums[nums.length - 1];
            for (int i = nums.length - 1; 1 < i; i--) {
                nums[i] = nums[i-1];
            }
            nums[nums.length - 1]=nums[0];
            nums[0] = temp;
            System.out.println(Arrays.toString(nums));
            k--;
        }
        return nums;
    }
}
