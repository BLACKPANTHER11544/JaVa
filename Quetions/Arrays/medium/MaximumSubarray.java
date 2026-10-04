package Quetions.Arrays.medium;

public class MaximumSubarray {
  public static int maxSubArray(int[] nums) {
    int maximum = nums[0];
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum = sum + nums[i];
      maximum = Integer.max(maximum, sum);
      if (sum < 0) {
        sum = 0;
      }
    }
    return maximum;

  }

  public static void main(String[] args) {
    int[] arr = { -2, -3, -7, -2, -10, -4 };
    System.out.println(MaximumSubarray.maxSubArray(arr));
  }
}
