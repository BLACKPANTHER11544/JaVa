package Quetions.String.medium;

public class RotateString {
    // t.c-> O(1), S.c -> O(n);
    public static boolean checkString(String str, String goal) {
        if (str.length() != goal.length()) {
            return false;
        }
        String dstr = str + str;
        if (dstr.contains(goal)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "abcde";
        String goal = "bcdea";
        System.out.println(RotateString.checkString(str, goal));
    }
}
