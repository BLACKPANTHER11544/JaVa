package Quetions.Recursion.easy;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {
    // t.c -> O(n), s.c -> O(n)
    public static List<Integer> fibo(int nums) {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(1);
        int index = 2;
        solve(nums, index, result);
        return result;
    }

    public static void solve(int num, int index, List<Integer> result) {
        if (index == num) {
            return;
        }
        int nextnum = result.get(index - 2) + result.get(index - 1);
        result.add(nextnum);
        solve(num, index + 1, result);
    }

    public static void main(String[] args) {
        int nums = 5;
        System.out.println(FibonacciSeries.fibo(nums));

    }
}