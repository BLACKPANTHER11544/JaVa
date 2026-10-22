package Quetions.BinarySearch.medium;

public class SplitArrayLargestSum {
    // same as BookAllocation problem, t.c -> O(Log(end-start)*n), s.c-> O(1)
    public static int LargestSum(int[] arr, int k) {
        int start = 0;
        int end = 0;
        for (int i : arr) {
            start = Math.max(start, i);
            end += i;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(arr, mid, k)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static boolean isPossible(int[] arr, int max, int k) {
        int sum = 0;
        int ArrayNum = 1;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] <= max) {
                sum += arr[i];
            } else {
                ArrayNum++;
                sum = arr[i];
            }
        }
        return ArrayNum <= k;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 1 };
        int k = 3;
        System.out.println(SplitArrayLargestSum.LargestSum(arr, k));
    }
}
