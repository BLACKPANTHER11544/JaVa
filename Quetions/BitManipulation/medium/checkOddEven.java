package Quetions.BitManipulation.medium;

public class checkOddEven {
    // t.c -> O(log(n)^2) and s.c -> log(n)
    /*
     * t.c -> O(log(n)^2) why log(n), it's because of n=n/2 as we are cutting n in
     * its half each time hence log(n)and why ^2, it because Strings are immutable
     * hence each concatination would result in making new String.
     */
    public static int convert(int n) {
        String binary = "";
        while (n > 0) {
            int rem = n % 2;
            binary = rem + binary;
            n = n / 2;
        }
        return Integer.parseInt(binary);
    }

    // t.c -> O(log(n)), s.c -> O(log(n))
    /*
     * t.c -> O(log(n)) why not ^2 here, because StringBuilder are mutable hence no
     * extra operation for concatination.
     */
    public static int convert1s(int n) {
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            int rem = n % 2;
            binary.insert(0, rem);
            n = n / 2;
        }
        return Integer.parseInt(binary.toString());
    }

    // t.c -> O(1) , s.c -> O(1)
    public static int leastSig(int n) {
        return n % 10;
    }

    public static boolean evenOdd(int n) {
        int result = leastSig(convert(n));
        return (result & 1) == 1 ? false : true;
    }

    public static void main(String[] args) {
        // t.c -> O(log(n)^2) and s.c -> O(log(n))
        System.out.println(checkOddEven.leastSig(convert(5)));
        System.out.println(checkOddEven.evenOdd(5));
        // Beast just return true or false;
        System.out.println("Below is done in O(1) ");
        System.out.println(checkOddEven.leastSig(5));

    }
}