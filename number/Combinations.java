public class Combinations {
    public static int findCombination(int n, int r) {
        if (r < 0 || n < 0 || r > n) {
            return 0;
        }
        int result;
        result = (fact(n) / (fact(r) * fact(n - r)));
        return result;
    }

    public static int fact(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = n; i > 0; i--) {
            result = result * i;
        }
        return result;
    }

    public static void main(String args[]) {
        int n = 5;
        int r = 2;
        System.out.println(Combinations.findCombination(n, r));
    }
}
