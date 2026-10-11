
package Quetions.BinarySearch.medium;

import java.util.Arrays;

public class FloorAndCeilInSortedArray {
    // t.c -> O(log(n)), and s.c -> O(1)
    public static int[] getFloorAndCeil(int[] nums, int x) {
        int floor = getFloorValue(nums, x);
        int ceil = getCeilValue(nums, x);
        return new int[] { floor, ceil };
    }

    public static int getFloorValue(int[] arr, int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int medium = start + (end - start) / 2;
            if (arr[medium] <= target) {
                ans = arr[medium];
                start = medium + 1;
            } else {
                end = medium - 1;
            }
        }
        return ans;
    }

    public static int getCeilValue(int[] arr, int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int medium = start + (end - start) / 2;
            if (arr[medium] >= target) {
                ans = arr[medium];
                end = medium - 1;
            } else {
                start = medium + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 10 };
        int target = 6;
        System.out.println(Arrays.toString(FloorAndCeilInSortedArray.getFloorAndCeil(arr, target)));

    }
}