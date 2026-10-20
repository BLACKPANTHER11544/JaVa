package Quetions.BinarySearch.medium;

public class BookAllocation {
    // t.c-> O(end-start)*(n) , s.c -> O(1);
    public static int findPages1(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for (int i : nums) {
            start = Math.max(start, i);
            end += i;
        }
        for (long i = start; i <= end; i++) {
            if (isPossible(nums, i, m)) {
                return (int) i;
            }
        }
        return -1;
    }

    // t.c -> O(log(end-start)*n) , s.c -> O(1);
    public static int findPages(int[] nums, int m) {
        if (m > nums.length) {
            return -1;
        }
        long start = 0;
        long end = 0;
        for (int i : nums) {
            start = Math.max(start, i);
            end += i;
        }
        while (start < end) {
            long mid = start + (end - start) / 2;
            if (isPossible(nums, mid, m)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return (int) start;
    }

    public static boolean isPossible(int[] arr, long max, int m) {
        int count = 0;
        int student = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + count <= max) {
                count += arr[i];
            } else {
                student++;
                count = arr[i];
            }
        }
        return student <= m;
    }

    public static void main(String[] args) {
        int[] arr = { 975, 139, 597 };
        int m = 1;
        System.out.println(BookAllocation.findPages1(arr, m));
    }

}