import java.util.ArrayList;

public class AllDivisors {
    // this approuch is having timeComplexity as o(n-2)=> o(n) ;
    public static ArrayList<Integer> Divisors(int n) {
        ArrayList<Integer> divisor = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                divisor.add(i);
            }
        }
        return divisor;
    }

    // this will give you O(sqrt(n)) ;
    public static ArrayList<Integer> Divisors2(int n) {
        ArrayList<Integer> divisor = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisor.add(i);
            }
            if (i != n / i) {
                divisor.add(n / i);
            }
        }
        return divisor;
    }

    public static void main(String[] args) {
        System.out.println((AllDivisors.Divisors(12)));
        System.out.println(AllDivisors.Divisors2(12));
    }
}
