package Quetions.String.medium;

public class StringToInteger {
    public static int myAtoi(String input) {
        int n = input.length();
        int i = 0;
        int sign = 1;
        int num = 0;
        while (i < n && input.charAt(i) == ' ') {
            i++;
        }
        if (i < n && input.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < n && input.charAt(i) == '+') {
            i++;
        }
        while (i < n && input.charAt(i) >= '0' && input.charAt(i) <= '9') {
            int digit = input.charAt(i) - '0';
            if (num > Integer.MAX_VALUE / 10 ||
                    (num == Integer.MAX_VALUE / 10 &&
                            digit > Integer.MAX_VALUE % 10)) {
                return sign == 1
                        ? Integer.MAX_VALUE
                        : Integer.MIN_VALUE;
            }
            num = num * 10 + digit;
            i++;
        }
        return num * sign;

    }

    public static void main(String[] args) {
        String str = "-12345";
        System.out.println(StringToInteger.myAtoi(str));
    }
}
