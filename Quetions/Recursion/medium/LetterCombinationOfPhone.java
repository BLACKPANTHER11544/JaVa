package Quetions.Recursion.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfPhone {
    // t.c-> O(n*(4^n)) s,c -> O(n*(4^n))
    public static List<String> letterCombination(String digits) {
        List<String> result = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        Map<Character, String> notepad = new HashMap<>();
        notepad.put('2', "abc");
        notepad.put('3', "def");
        notepad.put('4', "ghi");
        notepad.put('5', "jkl");
        notepad.put('6', "mno");
        notepad.put('7', "pqrs");
        notepad.put('8', "tuv");
        notepad.put('9', "wxyz");
        solve(0, digits, temp, result, notepad);
        return result;
    }

    public static void solve(int index, String digits, StringBuilder temp, List<String> result,
            Map<Character, String> notepad) {
        if (index == digits.length()) {
            result.add(temp.toString());
            return;
        }
        char ch = digits.charAt(index);
        String str = notepad.get(ch);
        for (int i = 0; i < str.length(); i++) {
            temp.append(str.charAt(i));
            solve(index + 1, digits, temp, result, notepad);
            temp.deleteCharAt(temp.length() - 1);
        }
    }

    public static void main(String[] args) {
        String digits = "34";
        System.out.println(LetterCombinationOfPhone.letterCombination(digits));
    }

}
