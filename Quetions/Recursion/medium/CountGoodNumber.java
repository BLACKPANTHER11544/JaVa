package Quetions.Recursion.medium;

public class CountGoodNumber {
    public static long M = (int) 1e9 + 7;

    // t.c -> O(n^2) , s.c-> O(n)
    public static int CountInteger(long n) {
        long oddPosition = BinaryExponentiation(5, (n + 1) / 2);
        long EvenPosition = BinaryExponentiation(4, n / 2);
        long result = (oddPosition * EvenPosition) % M;
        return (int) result;
    }

    public static long BinaryExponentiation(long a, long b) {
        if (b == 0) {
            return 1;
        }
        long half = BinaryExponentiation(a, b / 2);
        long result = (half * half) % M;
        if (b % 2 == 1) {
            result = (result * a) % M;
        }
        return result;

    }

    public static void main(String[] args) {
        long n = 2L;
        System.out.println(CountGoodNumber.CountInteger(n));
    }
}
