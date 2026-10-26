package Quetions.String.medium;

public class RemoveOuterParenthesis {
    // t.c-> O(n), s.c-> O(n-(number outermost primitive parenthesis)) ;
    public static String removeOutParenthesis(String s) {
        StringBuilder str = new StringBuilder();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (count != 0) {
                    str.append(ch);
                }
                count++;
            } else {
                count--;
                if (count != 0) {
                    str.append(ch);
                }
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String str = "()(()())(())";
        System.out.println(RemoveOuterParenthesis.removeOutParenthesis(str));
    }
}