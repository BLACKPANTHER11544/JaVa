package Quetions.Arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> r1 = new ArrayList<>();
                        r1.add(nums[i]);
                        r1.add(nums[j]);
                        r1.add(nums[k]);
                        if (!result.contains(r1)) {
                            result.add(r1);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 2, -1, -1, 3, -1 };
        System.out.println(ThreeSum.threeSum(arr));
    }
}
