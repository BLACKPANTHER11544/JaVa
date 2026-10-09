package Quetions.BinarySearch;

public class LowerBound {
    // t.c -> O(log(n)), s.c -> O(1)
    public static int lowerBound(int[] nums, int x) {
        int start = 0;
        int end = nums.length - 1;
        int ans = nums.length;
        while (start < end) {
            int medium = start + (end - start) / 2;
            if (nums[medium] >= x) {
                ans = medium;
                end = medium - 1;
            } else {
                start = medium + 1;
            }
        }
        return ans;
    }

    // t.c -> O(n) ,sc -> O(1)
    public static int lowerBound1(int[] nums, int taget) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= taget) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3 };
        int target = 2;
        System.out.println(LowerBound.lowerBound(arr, target));
    }
}

/*
 * binary search hi rahega but instead of finding the exact target, we find
 * first element that greater/equal to taget
 * so basically instead of nums[meidum] == target , we'll do nums[medim] >=
 * target return m
 * 
 */