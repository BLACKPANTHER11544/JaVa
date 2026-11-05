package Quetions.Recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class Subset1 {
    // brute force solution hence bohot bekar
    // t.c-> O(2^n*(n^2)) , s.c-> O(n+mk), //n =stack-frame, //m=result, //
    // resultantsum = k
    public static List<Integer> subsetSum(int[] set) {
        List<List<Integer>> resultsum = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int index = 0;

        solve(set, index, curr, resultsum);
        getSome(resultsum, result);
        return result;
    }

    public static void solve(int[] arr, int index, List<Integer> curr, List<List<Integer>> resultsum) {
        if (index == arr.length) {
            resultsum.add(new ArrayList<>(curr));
            return;
        }
        curr.add(arr[index]);
        solve(arr, index + 1, curr, resultsum);
        curr.remove(curr.size() - 1);
        solve(arr, index + 1, curr, resultsum);
    }

    public static void getSome(List<List<Integer>> resultsum, List<Integer> result) {
        for (int i = 0; i < resultsum.size(); i++) {
            int sum = 0;
            for (int j = 0; j < resultsum.get(i).size(); j++) {
                // if (resultsum.get(i).size() == 0 || resultsum.get(i) == null) {
                // result.add(0);
                // }
                sum += resultsum.get(i).get(j);
            }
            result.add(sum);
        }
    }

    // t.c O(2^n) , s.c -> O(n+m) "n" is stack-frame, "m" is space used by List
    public static List<Integer> subsetSum1(int[] set) {
        List<Integer> result = new ArrayList<>();
        solve1(set, 0, 0, result);
        return result;
    }

    public static void solve1(int[] arr, int index, int sum, List<Integer> result) {
        if (index == arr.length) {
            result.add(sum);
            return;
        }
        solve1(arr, index + 1, sum + arr[index], result);
        solve1(arr, index + 1, sum, result);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3 };
        System.out.println(Subset1.subsetSum1(arr));
    }
}
