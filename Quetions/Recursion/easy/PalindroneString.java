package Quetions.Recursion.easy;

public class PalindroneString {
    public static boolean palindromeCheck(String s) {
        return solve(s, 0, s.length() - 1);
    }

    public static boolean solve(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return solve(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String str = "hannah";
        System.out.println(PalindroneString.palindromeCheck(str));
    }
}
