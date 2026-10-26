package Quetions.String.medium;

public class MaximumNestingDepthParenthesis {
    // t.c -> O(n), s.c-> O(1);
    public static int maxDepth(String s) {
        int count = 0;
        int maxdepth = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                count++;
                maxdepth = Math.max(count, maxdepth);
            } else if (ch == ')') {
                count--;
            } else {
                continue;
            }
        }
        return maxdepth;
    }

    public static void main(String[] args) {
        String str = "(1)+((2))+(((3)))";
        System.out.println(MaximumNestingDepthParenthesis.maxDepth(str));
    }
}
