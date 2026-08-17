public class primeNumber {
    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(primeNumber.isPrime(3));
        System.out.println(primeNumber.isPrime(4));
        System.out.println(primeNumber.isPrime(1));
    }
}