package Quetions.Recursion.medium;

public class sumofArray2 {
    // t.c -> O(n), s.c ->O(n)
    public static int arraySum(int[] nums) {
        int sum = 0;
        int ans = solve(nums, sum, 0);
        return ans;
    }

    public static int solve(int[] nums, int sum, int index) {
        if (index == nums.length) {
            return sum;
        } else {
            return solve(nums, sum + nums[index], index + 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = { 5, 8, 1 };
        System.out.println(sumofArray2.arraySum(nums));
    }
}
