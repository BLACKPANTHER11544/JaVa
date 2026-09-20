import java.util.Scanner;

public class practcie1 {
    public static int PrintNumber(Scanner sc) {
        int input = sc.nextInt();
        return input;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(practcie1.PrintNumber(sc));
    }
}
