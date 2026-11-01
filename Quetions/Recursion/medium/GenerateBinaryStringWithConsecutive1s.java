package Quetions.Recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateBinaryStringWithConsecutive1s {
    public static List<String> generateBinaryStrings(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        solve(result, 0, n, sb);
        return result;
    }

    public static void solve(List<String> result, int index, int length, StringBuilder sb) {
        if (index == length) {
            result.add(sb.toString());
            return;
        }
        sb.append("0");
        solve(result, index + 1, length, sb);
        sb.deleteCharAt(sb.length() - 1);
        if (index == 0 || sb.charAt(index - 1) != '1') {
            sb.append("1");
            solve(result, index + 1, length, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(GenerateBinaryStringWithConsecutive1s.generateBinaryStrings(n));
    }
}
