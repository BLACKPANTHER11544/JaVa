package Quetions.Recursion.easy;

public class SumOfDigitOfANumber {
    public static int addDigits(int num) {
        // int sum = getSum(num, 0);
        // return getSum(sum, 0);
        int sum = solve(num, 0);
        return solve(sum, 0);
    }

    public static int getSum(int num, int sum) {
        int temp = 0;
        while (num > 0) {
            temp = num % 10;
            sum += temp;
            num /= 10;
        }
        return sum;
    }

    // recurive solution
    public static int solve(int num, int sum) {
        if (num == 0) {
            return sum;
        }
        int temp = num % 10;
        num /= 10;
        return solve(num, sum + temp);
    }

    public static void main(String[] args) {
        System.out.println(SumOfDigitOfANumber.addDigits(529));
    }
}
