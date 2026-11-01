package Quetions.Recursion.medium;

public class countSubsequenceWithSumK {
    // t.c -> O(2^n) , s.c -> O(n)
    public static int countSubsequenceWithTargetSum(int[] nums, int k) {
        return solve(nums, k, 0, 0);
    }

    public static int solve(int[] nums, int k, int index, int sum) {
        if (index == nums.length) {
            if (sum == k) {
                return 1;
            }
            return 0;
        }
        int pick = solve(nums, k, index + 1, sum + nums[index]);
        int notPick = solve(nums, k, index + 1, sum);
        return pick + notPick;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 10, 5, 1, 3 };
        int k = 5;
        System.out.println(countSubsequenceWithSumK.countSubsequenceWithTargetSum(arr, k));
    }
}
