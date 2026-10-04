package Quetions.Arrays.medium;

public class MaximumProductSubarray {
    // failed test-cases, as in this no -ve number as handled
    public static int maxProduct(int[] nums) {
        if (nums.length - 1 == 0) {
            return nums[0];
        }
        int pro = 1;
        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            pro = pro * nums[i];
            max = Integer.max(max, pro);
            if (pro < 0 || pro == 0) {
                pro = 1;
            }
        }
        return max;
    }

    public static int maxProduct1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            if (curr < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            maxSoFar = Math.max(curr, maxSoFar * curr);
            minSoFar = Math.min(curr, minSoFar * curr);

            result = Math.max(result, maxSoFar);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { -5, 0, -2 };
        System.out.println(MaximumProductSubarray.maxProduct1(arr));
    }
}
