package Quetions.Hashing.medium;

import java.util.TreeSet;
import java.util.Set;;

public class LongestConsecutiveSequence {
    // tc-> O(n) and S.c -> O(n);
    public static int longestConsecutive(int[] nums) {
        Set<Integer> r1 = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            r1.add(nums[i]);
        }
        int count = 0;
        int maxCount = 0;
        Integer previous = null;
        for (int current : r1) {
            if (previous != null && current == previous + 1) {
                count++;
            } else {
                count = 1;
            }
            maxCount = Math.max(maxCount, count);
            previous = current;
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = { 100, 4, 200, 1, 3, 2, 10, 11, 12, 13, 14, 15 };
        int result = LongestConsecutiveSequence.longestConsecutive(arr);
        System.out.println(result);
    }
}

/*
 * why do we need maxCount=>
 * we need maxcount as it will store that gratest straek for longest consecutive
 * elements
 * example :
 * arr = {100, 4, 200, 1, 3, 2, 10, 11, 12, 13, 14, 15} ;
 * after treeSet t1,
 * t1 = {1, 2, 3, 4, 10, 11, 12, 13, 14, 15, 100, 200} ;
 * from 1 to 4, the maxiCount=4,
 * and as as the (i) will reach 10 the count will get reinitialized to 1 ;
 * and from 10 to 15, the maxCount will become 6,
 * hence Math.max(4,6) => 6, longest consecutive sequence
 * 
 * 
 */
