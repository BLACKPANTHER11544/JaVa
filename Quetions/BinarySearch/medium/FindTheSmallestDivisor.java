package Quetions.BinarySearch.medium;

public class FindTheSmallestDivisor {
    // t.c -> O(n(max(m))) , s.c -> O(1);
    public static int smallestDivisor(int[] nums, int limit) {
        int maxElement = 0;
        for (int num : nums) {
            maxElement = Math.max(num, maxElement);
        }
        int ans = -1;
        for (int i = 1; i <= maxElement; i++) {
            int ceilSum = 0;
            for (int num : nums) {
                ceilSum = ceilSum + (num + i - 1) / i;
            }
            if (ceilSum <= limit) {
                ans = i;
                break;
            }
        }
        return ans;
    }

    // t.c -> nlog(m) and s.c -> O(1);
    public static int smallDivisor(int[] arr, int threshold) {
        int maxElement = 0;

        for (int num : arr) {
            maxElement = Math.max(maxElement, num);
        }

        int start = 1;
        int end = maxElement;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (functionCall(arr, mid, threshold)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;

    }

    public static boolean functionCall(int[] arr, int divisor, int threshold) {
        long total = 0;
        for (int num : arr) {
            total += (num + (long) divisor - 1) / divisor;
            if (total > threshold) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 15, 6, 3 };
        int limit = 8;
        System.out.println(FindTheSmallestDivisor.smallDivisor(arr, limit));
    }
}

/*



*/
