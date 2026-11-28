package Quetions.BitManipulation.medium;

public class XorInRange {
    // t.c -> O(r-l) , s.c->O(1)
    public static int xor(int l, int r) {
        int sum = l;
        for (int i = l + 1; i <= r; i++) {
            sum = sum ^ i;
        }

        return sum;
    }

    public static int better(int n) {
        if (n % 4 == 0)
            return n;
        if (n % 4 == 1)
            return 1;
        if (n % 4 == 2)
            return n + 1;

        return 0;
    }

    // t.c -> O(1), s.c-> O(1)
    public static int xor1(int l, int r) {
        return better(r) ^ better(l - 1);
    }

    public static void main(String[] args) {
        System.out.println(XorInRange.xor1(3, 5));
    }
}

// i=4;sum=3^4=>100^011=>111=>7^5 => 111 ^ 101 => 010
