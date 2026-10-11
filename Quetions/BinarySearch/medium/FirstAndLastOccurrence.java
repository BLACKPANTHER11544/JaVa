package Quetions.BinarySearch.medium;

import java.util.Arrays;

public class FirstAndLastOccurrence {
    public static int[] searchRange(int[] nums, int target) {
        int firstOccurence = getFirstOccurence(nums, target);
        if (firstOccurence == -1) {
            return new int[] { firstOccurence, -1 };
        }
        int lastOccurence = getLastOccurence(nums, target);
        return new int[] { firstOccurence, lastOccurence };
    }

    public static int getFirstOccurence(int[] nums, int target) {
        int first = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int medium = start + (end - start) / 2;
            if (nums[medium] >= target) {
                if (nums[medium] == target) {
                    first = medium;
                }

                end = medium - 1;
            } else {
                start = medium + 1;
            }
        }

        return first;
    }

    public static int getLastOccurence(int[] nums, int target) {
        int last = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int medium = start + (end - start) / 2;
            if (nums[medium] <= target) {
                if (nums[medium] == target) {
                    last = medium;
                }

                start = medium + 1;
            } else {
                end = medium - 1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        System.out.println(Arrays.toString(FirstAndLastOccurrence.searchRange(arr, target)));
    }
}
