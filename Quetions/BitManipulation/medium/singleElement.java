package Quetions.BitManipulation.medium;

import java.util.Map;
import java.util.HashMap;

public class singleElement {
    // t.c -> O(n) ,s.c -> O(n)
    public static int single(int[] nums) {
        Map<Integer, Integer> result = new HashMap<>();

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
        int[] arr = { 2, 2, 2, 3 };
        System.out.println(singleElement.single(arr));
    }
}
