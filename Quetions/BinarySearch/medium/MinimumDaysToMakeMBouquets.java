package Quetions.BinarySearch.medium;

public class MinimumDaysToMakeMBouquets {
    // t.c -> O(end-start)*log(n) ,s.c -> O(1);
    public static int roseGarden(int n, int[] nums, int k, int m) {
        if ((long) m * k > n) {
            return -1;
        }
        int start = (int) Integer.MAX_VALUE;
        int end = (int) Integer.MIN_VALUE;
        for (int num : nums) {
            start = Math.min(num, start);
            end = Math.max(num, end);
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (IfPossible(nums, mid, m, k)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static boolean IfPossible(int[] arr, int mid, int m, int k) {
        int count = 0;
        int bouqet = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= mid) {
                count++;
                if (count == k) {
                    bouqet++;
                    count = 0;
                }
                if (bouqet >= m) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = { 7, 7, 7, 7, 13, 11, 12, 7 };
        int m = 2;
        int k = 3;
        System.out.println(MinimumDaysToMakeMBouquets.roseGarden(arr.length, arr, m, k));
    }
}
