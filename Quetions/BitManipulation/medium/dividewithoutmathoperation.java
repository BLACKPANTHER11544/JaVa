package Quetions.BitManipulation.medium;

public class dividewithoutmathoperation {
    // t.c -> O(count) , s.c -> O(1)
    private static int check(int divident, int divisor) {
        int count;
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }

        if (divident == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        // true if any one is true.
        boolean negative = (divident < 0) ^ (divisor < 0);
        int d1 = Math.abs(divident);
        int d2 = Math.abs(divisor);
        count = getCount(d1, d2);
        return negative == true ? (count * (-1)) : count;
    }

    private static int getCount(int divident, int divisor) {
        int count = 0;
        while (divident >= 0) {
            divident -= divisor;
            count++;
        }
        return count - 1;
    }

    public static void main(String[] args) {
        System.out.println(dividewithoutmathoperation.check(7, -3));
    }

}
