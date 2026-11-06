package Quetions.Recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class combinationSum3 {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>(k);
        int index = 0;
        int sum = 0;
        solve(arr, index, sum, k, n, result, curr);
        return result;
    }

    public static void solve(int[] arr, int index, int sum, int length, int target, List<List<Integer>> result,
            List<Integer> curr) {
        if (sum == target && curr.size() <= length) {
            // result.add(new ArrayList<>(curr));
            // return;
            if (curr.size() == length) {
                result.add(new ArrayList<>(curr));
                return;
            }
        }
        if (sum > target || curr.size() == length) {
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (sum + arr[i] > target) {
                break;
            }

            curr.add(arr[i]);
            solve(arr, i + 1, sum + arr[i], length, target, result, curr);
            curr.remove(curr.size() - 1);
            // solve(arr, i + 1, sum, length, target, result, curr);
        }
    }

    public static List<List<Integer>> newcombinationSum3(int k, int n) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>(k);
        int index = 0;
        int sum = 0;
        solve1(arr, index, sum, k, n, result, curr);
        return result;
    }

    public static void solve1(int[] arr, int index, int sum, int length, int target, List<List<Integer>> result,
            List<Integer> curr) {
        if (sum == target && curr.size() <= length) {
            // result.add(new ArrayList<>(curr));
            // return;
            if (curr.size() == length) {
                result.add(new ArrayList<>(curr));
                return;
            }
        }
        if (sum > target || curr.size() == length || index == arr.length) {
            return;
        }

        curr.add(arr[index]);
        solve1(arr, index + 1, sum + arr[index], length, target, result, curr);
        curr.remove(curr.size() - 1);
        solve1(arr, index + 1, sum, length, target, result, curr);
    }

    public static void main(String[] args) {
        int k = 3;
        int n = 7;
        System.out.println(combinationSum3.newcombinationSum3(k, n));
    }
}
