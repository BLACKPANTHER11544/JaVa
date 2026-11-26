package Quetions.BitManipulation.medium;

public class SetRightMostUnBit {
    public static int convert(int n) {
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            int rem = n % 2;
            binary.insert(0, rem);
            n = n / 10;
        }
        return Integer.parseInt(binary.toString());
    }

    public static int unsetToSet(int n) {
        return n | (n + 1);
    }

}
