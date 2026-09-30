package Quetions.Arrays.medium;

import java.util.Arrays;

public class twoSum {
    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0 };
        int target = 0;
        System.out.println(Arrays.toString(twoSum.twoSum1(arr, target)));
    }
}
