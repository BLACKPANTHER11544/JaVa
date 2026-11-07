package Quetions.Recursion.easy;

public class PrimeNumber {
    public static boolean checkPrime(int num) {
        return solve(num, 2);
    }

    public static boolean solve(int num, int start) {
        if (start == num) {
            return !(num % 2 == 0);
        }
        return solve(num, start + 1);
    }

    public static void main(String[] args) {
        int num = 3;
        System.out.println(PrimeNumber.checkPrime(num));
    }
}
