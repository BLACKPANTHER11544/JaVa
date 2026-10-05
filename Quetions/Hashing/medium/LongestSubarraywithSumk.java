package Quetions.Hashing.medium;

import java.util.TreeSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LongestSubarraywithSumk {
    public static int longestSubarray(int[] nums, int k) {
        Map<Long, Integer> firstPosition = new HashMap<>();
        firstPosition.put(0L, -1);

        long prefixSum = 0;
        int bestLength = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            long neededPrefix = prefixSum - k;

            if (firstPosition.containsKey(neededPrefix)) {
                int startPosition = firstPosition.get(neededPrefix);
                System.out.println(startPosition);
                bestLength = Math.max(bestLength, i - startPosition);
            }

            firstPosition.putIfAbsent(prefixSum, i);
        }

        return bestLength;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 7, 1, 9 };
        int target = 15;
        System.out.println(LongestSubarraywithSumk.longestSubarray(arr, target));

    }
}