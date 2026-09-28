package Quetions.Arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class pascal3 {
    public static List<List<Integer>> PascalTriangle(int n) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(getRow(i));
        }
        return result;
    }

    public static List<Integer> getRow(int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            ans.add((int) nCr(n, i));
        }
        return ans;
    }

    public static long nCr(int n, int r) {
        if (r < 0 || r > n) {
            return 0;
        } else if (r > n - r) {
            r = n - r;
        }
        long temp = 1;
        for (int i = 0; i < r; i++) {
            temp = temp * (n - i);
            temp = temp / (i + 1);
        }
        return temp;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> triangle = pascal3.PascalTriangle(n);

        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
