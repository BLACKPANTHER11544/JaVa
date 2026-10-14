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

    public static int smallDivisor(int[] arr, int threshold) {
        int maxElement = 0;
        int totalSum = 0;
        for (int num : arr) {
            maxElement = Math.max(num, maxElement);
            totalSum += num;
        }
        int start = 1;
        int end = maxElement;
        if (threshold >= totalSum) {
            return 1;
        }
        if (threshold == arr.length) {
            return end;
        }
        while (start <= end) {
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
        int total = 0;
        for (int num : arr) {
            total += (num + divisor - 1) / divisor;
            if (total > threshold) {
                return false;
            }
        }
        return total <= threshold;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 4, 2, 3 };
        int limit = 10;
        System.out.println(FindTheSmallestDivisor.smallDivisor(arr, limit));
    }
}

/*



*/
