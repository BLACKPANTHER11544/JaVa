package Quetions.Recursion.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Subset2 {
    // t.c -> O(n*(2^n)+nlogn) , s.c-> O(n*(2^n)));
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int index = 0;
        Arrays.sort(nums);
        solve(nums, index, result, curr);
        return result;
    }

    public static void solve(int[] arr, int index, List<List<Integer>> result, List<Integer> curr) {
        result.add(new ArrayList<>(curr));
        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }
            curr.add(arr[i]);
            solve(arr, i + 1, result, curr);
            curr.remove(curr.size() - 1);

        }
    }

    // t.c -> O(n*(2^n)+nlogn) , s.c-> O(n*(2^n));
    public static List<List<Integer>> subsetsWithDup1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int index = 0;
        solve1(nums, index, result, curr);
        return result;
    }

    public static void solve1(int[] arr, int index, List<List<Integer>> result, List<Integer> curr) {
        if (index == arr.length) {
            result.add(new ArrayList<>(curr));
            return;
        }
        curr.add(arr[index]);
        solve1(arr, index + 1, result, curr);
        curr.remove(curr.size() - 1);
        int nextIndex = index + 1;
        while (nextIndex < arr.length && arr[nextIndex] == arr[index]) {
            nextIndex += 1;
        }
        solve1(arr, nextIndex, result, curr);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2 };
        System.out.println(Subset2.subsetsWithDup1(arr));
    }

}