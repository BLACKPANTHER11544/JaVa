package Quetions.Arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    // brute force
    // public static List<List<Integer>> threeSum(int[] nums) {
    // List<List<Integer>> result = new ArrayList<>();
    // for (int i = 0; i < nums.length; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // for (int k = j + 1; k < nums.length; k++) {
    // if (nums[i] + nums[j] + nums[k] == 0) {
    // List<Integer> r1 = new ArrayList<>();
    // r1.add(nums[i]);
    // r1.add(nums[j]);
    // r1.add(nums[k]);
    // if (!result.contains(r1)) {
    // result.add(r1);
    // }
    // }
    // }
    // }
    // }
    // return result;
    // }
    public static List<List<Integer>> result = new ArrayList<>();
    // tc=> O(n^2)
    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int n1 = nums[i];
            int target = -n1;
            twoSum(nums, target, i + 1, n - 1);
        }
        return result;
    }

    public static void twoSum(int[] nums, int target, int i, int j) {
        while (i < j) {
            if (nums[i] + nums[j] > target) {
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                while (i < j && nums[i] == nums[i + 1])
                    i++;
                while (i < j && nums[j] == nums[j - 1])
                    j--;
                // result.add(Arrays.asList(-target, nums[i], nums[j]));
                List<Integer> r1 = new ArrayList<>() ; 
                r1.add(-target) ; 
                r1.add(nums[i]); 
                r1.add(nums[j]); 
                result.add(r1); 
                i++;
                j--;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {2, -1, -1, 3, -1 };
        System.out.println(ThreeSum.threeSum(arr));
    }
}
