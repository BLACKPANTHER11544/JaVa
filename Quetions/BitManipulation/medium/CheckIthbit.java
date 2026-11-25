package Quetions.BitManipulation.medium;

public class CheckIthbit {
    public static int convert(int n) {
        String binary = "";
        while (n > 0) {
            int rem = n % 2;
            binary = rem + binary;
            n = n / 2;
        }
        return Integer.parseInt(binary);
    }

    public static void main(String[] args) {
        long binary = (CheckIthbit.convert(5));
        long newBit = 1 << 2;
        long result = binary & newBit;
        if (result != 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
