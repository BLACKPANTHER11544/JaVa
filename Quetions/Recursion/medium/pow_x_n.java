package Quetions.Recursion.medium;

public class pow_x_n {
    // t.c -> O(1) , s.c -> O(1) // best worst case t.c and s.c
    public static double myPow(double x, int n) {
        return Math.pow(x, n);
    }

    // t.c-> O(logn), s.c -> O(1)
    public static double mypow(double x, long n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return mypow(1 / x, -n);
        } else if (n % 2 == 0) {
            return mypow(x * x, n / 2);
        } else {
            return x * mypow(x * x, (n - 1) / 2);
        }
    }

    // t.c-> O(n) , s.c -> O(1)
    public static double mypow1(double x, int n) {
        double number = 1l;
        for (int i = 1; i <= n; i++) {
            number *= x;
        }
        return number;
    }

    public static void main(String[] args) {
        double x = 2.0000;
        int n = 3;
        double number = pow_x_n.myPow(x, n);
        double number1 = pow_x_n.mypow(x, n);
        double number2 = pow_x_n.mypow1(x, n);
        System.out.printf("%.6f%n", number);
        System.out.printf("%.6f", number1);
        System.out.printf("%.6f", number2);
    }
}
