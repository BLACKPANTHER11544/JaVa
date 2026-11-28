package Quetions.BitManipulation.medium;

import java.util.List;
import java.util.ArrayList;

public class powerset {
    // t.c -> O(n2^n), s.c-> O(n2^n)
    public static List<List<Integer>> pow(int[] arr) {
        int subset = 1 << arr.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < subset; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                if ((i & (1 << j)) != 0) {
                    list.add(arr[j]);
                }
            }
            result.add(list);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(powerset.pow(arr));
    }
}

/*
 * Count the 1's and put in the resultant. Suppose array=[1,2,3]
 * 0 0 0
 * 0 0 1
 * 0 1 0
 * 0 1 1
 * 1 0 0
 * 1 0 1
 * 1 1 0
 * 1 1 1
 */
