package Quetions.String.medium;

public class RomanInteger {
    // t.c -> O(n) ,s.c-> O(1)
    public static int romanToInt(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = getValue(s.charAt(i));
            if (i + 1 < s.length() && current < getValue(s.charAt(i + 1))) {
                count -= current;
            } else {
                count += current;
            }
        }
        return count;
    }

    public static int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        String str = "XLII";
        System.out.println(RomanInteger.romanToInt(str));

    }
}
