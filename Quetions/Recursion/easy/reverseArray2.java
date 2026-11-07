package Quetions.Recursion.easy;

public class reverseArray2 {
    public static int[] reverseArray(int[] nums) {
        return solve(nums, 0, nums.length - 1);
    }

    public static int[] solve(int[] nums, int start, int end) {
        if (start >= end) {
            return nums;
        }
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        return solve(nums, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println(reverseArray2.reverseArray(nums));
    }
}
