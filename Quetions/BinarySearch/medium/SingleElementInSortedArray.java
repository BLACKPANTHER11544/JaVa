package Quetions.BinarySearch.medium;

import java.util.HashMap;
import java.util.Map;

public class SingleElementInSortedArray {
    // bekar hai bhai, mamla bekar t.c-> O(n), s.c -> O(n)
    public static int singleNonDuplicate(int[] nums) {
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            result.put(nums[i], result.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };
        System.out.println(SingleElementInSortedArray.singleNonDuplicate(arr));
    }
}
