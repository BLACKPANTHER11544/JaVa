package Quetions.Recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

    public static List<List<Integer>> powerSet1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        solve1(curr, 0, nums, result);

        return result;
    }

    // t.c-> O(n2^n)
    public static void solve1(
            List<Integer> curr,
            int counter,
            int[] nums,
            List<List<Integer>> result) {

        /*
         * why not counter == nums.length -1, as if we do so
         * then when counter will become 2 we'll hit base-case
         * and we want base-case to get true when whole nums are processed.
         */
        if (counter == nums.length) {
            result.add(new ArrayList<>(curr));
            return;
        }

        // Choice 1: Do not pick nums[counter]
        solve1(curr, counter + 1, nums, result);

        // Choice 2: Pick nums[counter]
        curr.add(nums[counter]);

        solve1(curr, counter + 1, nums, result);

        // Backtrack: undo the choice
        curr.remove(curr.size() - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(PowerSet.powerSet1(arr));
    }
}
