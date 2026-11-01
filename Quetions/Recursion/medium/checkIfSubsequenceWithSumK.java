package Quetions.Recursion.medium;

public class checkIfSubsequenceWithSumK {

    public static boolean checkSubsequenceSum(int[] nums, int k) {
        int sum = 0;
        int i = 0;
        return solve(nums, sum, k, i);
    }

    public static boolean solve(int[] nums, int sum, int k, int i) {
        if (i == nums.length) {
            return sum == k;
        }
        if (solve(nums, sum + nums[i], k, i + 1)) {
            return true;
        }
        if (solve(nums, sum, k, i + 1)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 8;
        System.out.println(checkIfSubsequenceWithSumK.checkSubsequenceSum(arr, k));

    }
}