package Quetions.Recursion.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

public class combinationSumII {
    // t.c -> O(2^n*(nLogn)), s.c-> O(n+mn);
    // by the way ye TLE de rha hai
    // because of temp, sorting and comparision at each call
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> s1 = new HashSet<>();
        List<Integer> curr = new ArrayList<>();
        int index = 0;
        solve(candidates, target, index, result, s1, curr);
        return result;
    }

    public static void solve(int[] arr, int target, int index, List<List<Integer>> result, Set<List<Integer>> s1,
            List<Integer> curr) {
        if (target == 0) {
            List<Integer> temp = new ArrayList<>(curr);
            Collections.sort(temp);
            if (!s1.contains(temp)) {
                result.add(new ArrayList<>(temp));
                s1.add(temp);
            }
            return;
        }
        if (index == arr.length || target < 0) {
            return;
        }
        // take
        curr.add(arr[index]);
        solve(arr, target - arr[index], index + 1, result, s1, curr);
        // don't take
        curr.remove(curr.size() - 1);
        solve(arr, target, index + 1, result, s1, curr);
    }

    // t.c -> 2^n*(nlogn) s.c-> O(mn), as "n" is the memory used by stack frames,
    // and "m" is the memory used by resultant list.

    public static List<List<Integer>> newcombinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int index = 0;
        Arrays.sort(candidates);
        solve1(candidates, target, index, result, curr);
        return result;
    }

    public static void solve1(int[] arr, int target, int index, List<List<Integer>> result, List<Integer> curr) {
        if (target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }
            if (arr[i] > target) {
                break;
            }
            curr.add(arr[i]);
            solve1(arr, target - arr[i], i + 1, result, curr);
            curr.remove(curr.size() - 1);

        }
    }

    public static void main(String[] args) {
        int[] candidates = { 2, 1, 2, 7, 6, 1, 5 };
        int target = 8;
        System.out.println(combinationSumII.newcombinationSum2(candidates, target));
    }
}
