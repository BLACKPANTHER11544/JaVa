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

    public static int singleELementInSorted(int[] arr) {
        // t.c -> O(n) and s.c -> O(1)
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum ^= arr[i];
        }
        return sum;
    }

    public static int singleELementInSorted1(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            Boolean isEven;
            if ((end - start) % 2 == 0) {
                isEven = true;
            } else {
                isEven = false;
            }
            if (arr[mid] == arr[mid + 1]) {
                if (isEven) {
                    start = mid + 2;
                } else {
                    end = mid - 1;
                }
            } else {
                if (isEven) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            }
        }
        return arr[end];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };
        System.out.println(SingleElementInSortedArray.singleELementInSorted1(arr));
    }
}
