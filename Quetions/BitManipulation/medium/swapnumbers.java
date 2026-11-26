package Quetions.BitManipulation.medium;

public class swapnumbers {
    // t.c -> O(1), s.c -> O(n)
    public static int[] swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return new int[] { a, b };
    }

    // t.c -> O(n)
    public static void main(String[] args) {
        for (int i = 0; i < swap(5, 10).length; i++) {
            System.out.println(swap(5, 4)[i]);
        }
    }
}
