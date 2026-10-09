package Quetions.BinarySearch;

public class UpperBound {
    public static int upperBound(int[] nums, int x) {
        int start = 0;
        int end = nums.length - 1;
        int result = nums.length;
        while (start <= end) {
            int medium = start + (end - start) / 2;
            if (nums[medium] > x) {
                result = medium;
                end = medium - 1;
            } else {
                start = medium + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3 };
        int target = 2;
        System.out.println(UpperBound.upperBound(arr, target));
    }
}
