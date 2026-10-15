package Quetions.BinarySearch.medium;

public class KokoEatingBanana {
    // t.c -> O(nm) , s.c -> O(1)
    public static int minimumRateToEatBananas(int[] nums, int limit) {
        int maxElement = 0;
        for (int num : nums) {
            maxElement = Math.max(num, maxElement);
        }
        int ans = -1;
        for (int i = 1; i <= maxElement; i++) {
            int TotalTime = 0;
            for (int num : nums) {
                TotalTime += (num + i - 1) / i;
            }
            if (TotalTime <= limit) {
                ans = i;
                break;
            }
        }
        return ans;
    }

    public static int minimumRateToEatBananas1(int[] nums, int limit) {
        int maxElement = 0;

        for (int num : nums) {
            maxElement = Math.max(maxElement, num);
        }

        int start = 1;
        int end = maxElement;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (getCeilValue(nums, mid, limit)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public static boolean getCeilValue(int[] arr, int mid, int limit) {
        long total = 0;

        for (int num : arr) {
            total += (num + (long) mid - 1) / mid;

            if (total > limit) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 15, 6, 3 };
        int limit = 8;
        System.out.println(KokoEatingBanana.minimumRateToEatBananas1(arr, limit));
    }
}

/*
 * 
 * 10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200
 * 
 */
