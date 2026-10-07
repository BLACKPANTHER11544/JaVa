package Quetions.Hashing.medium;

import java.util.Map;
import java.util.HashMap;;

public class longestSubArrayWithSum0 {
    public static int maxLen(int[] arr) {
        long k = 0;
        Map<Long, Integer> result = new HashMap<>();
        result.put(0L, -1);
        long prefixsum = 0;
        long bestlength = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixsum += arr[i];
            long neededPrefix = prefixsum - k;
            if (result.containsKey(neededPrefix)) {
                int startPosition = result.get(neededPrefix);
                bestlength = Math.max(bestlength, i - startPosition);
            }
            result.putIfAbsent(prefixsum, i);
        }
        return (int) bestlength;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 10, 4 };
        System.out.println(longestSubArrayWithSum0.maxLen(arr));
    }
}
