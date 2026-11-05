package Quetions.Recursion.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class combinationSum {
    // t.c -> O(3^n), s.c-> O(n+mk) // O(n) is for stack frame and O(mk) are for
    // HashSet and resultant arrayList.
    public static List<List<Integer>> CombinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> s1 = new HashSet<>();
        List<Integer> curr = new ArrayList<>();
        int index = 0;
        solve(candidates, target, index, result, curr, s1);
        return result;
    }

    public static void solve(int[] arr, int target, int index, List<List<Integer>> result, List<Integer> curr,
            Set<List<Integer>> s1) {
        if (target == 0) {
            if (!s1.contains(curr)) {
                result.add(new ArrayList<>(curr));
                s1.add(curr);
            }
            return;
        }
        if (index == arr.length || target < 0) {
            return;
        }
        curr.add(arr[index]);
        solve(arr, target - arr[index], index + 1, result, curr, s1);
        solve(arr, target - arr[index], index, result, curr, s1);
        curr.remove(curr.size() - 1);
        solve(arr, target, index + 1, result, curr, s1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 4 };
        int target = 7;
        System.out.println(combinationSum.CombinationSum(arr, target));
    }
}
