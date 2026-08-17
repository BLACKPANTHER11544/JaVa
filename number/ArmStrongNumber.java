public class ArmStrongNumber {
    public boolean CheckArmsStringNumber(int n) {
        int length = String.valueOf(n).length();
        int sum = 0;
        int num = n;
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, length);
            n = n / 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        ArmStrongNumber obj = new ArmStrongNumber();
        System.out.println(obj.CheckArmsStringNumber(153));
    }
}
