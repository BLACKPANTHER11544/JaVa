package Quetions.String.medium;

public class RomanInteger {
    public static int romanToInt(String s) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case 'I':
                    count += 1;
                    break;
                case 'V':
                    count += 5;
                    break;
                case 'X':
                    count += 10;
                    break;
                case 'L':
                    count += 50;
                    break;
                case 'C':
                    count += 100;
                    break;
                case 'D':
                    count += 500;
                    break;
                case 'M':
                    count += 1000;
                    break;
                default:
                    continue;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "XLII";
        System.out.println(RomanInteger.romanToInt(str));

    }
}
