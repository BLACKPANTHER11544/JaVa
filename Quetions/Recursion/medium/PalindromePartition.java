package Quetions.Recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {
    // t.c-> O(n*(2^n))
    public static List<List<String>> partition(String str) {
        List<List<String>> result = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        solve(str, 0, temp, result);
        return result;
    }

    public static void solve(String str, int index, List<String> temp, List<List<String>> result) {
        if (index == str.length()) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < str.length(); i++) {
            String subString = str.substring(index, i + 1);
            if (isPalindrome(subString)) {
                temp.add(subString);
                solve(str, i + 1, temp, result);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end) {
            if (!(str.charAt(start) == str.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "aabaa";
        System.out.println(PalindromePartition.partition(str));
    }
}
