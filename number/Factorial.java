import java.util.Scanner;

public class Factorial {
    public static int findFact(int num) {
        if (num < 0) {
            return -1;
        }
        if (num == 0 || num == 1) {
            return 1;
        }
        int result = 1;
        for (int i = num; i > 0; i--) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        System.out.println(Factorial.findFact(num));
        sc.close();
    }
}
