package Quetions.Recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class generateParntheses {

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        solve("", n, 0, result);
        return result;
    }

    public static boolean isValid(String str) {
        int sum = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                sum++;
            } else {
                sum--;
            }
            if (sum < 0) {
                return false;
            }
        }
        return sum == 0;
    }

    // t.c -> (2n*(2^2n)), this 2n is because of isValid() otherwise it would have
    // been O(2^2n),
    // s.c -> O(2^n)
    public static void solve(String curr, int n, int length, List<String> result) {
        if (length == 2 * n) {
            if (isValid(curr)) {
                result.add(curr);
            }
            return;
        }
        curr += "(";
        solve(curr, n, length + 1, result);
        curr = curr.substring(0, curr.length() - 1);
        curr += ")";
        solve(curr, n, length + 1, result);
    }

    public static List<String> result = new ArrayList<>();

    public static List<String> generateParenthesis1(int n) {
        solve1(n, "", 0, 0);
        return result;
    }

    // t.c -> O(2^2n) , s.c-> O(2n);
    public static void solve1(int n, String curr, int open, int close) {
        if (curr.length() == 2 * n) {
            result.add(curr);
            return;
        }

        if (open < n) {
            curr += '(';
            solve1(n, curr, open + 1, close);
            curr = curr.substring(0, curr.length() - 1);
        }
        if (close < open) {
            curr += ')';
            solve1(n, curr, open, close + 1);
            curr = curr.substring(0, curr.length() - 1);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParntheses.generateParenthesis1(n));
    }
}
