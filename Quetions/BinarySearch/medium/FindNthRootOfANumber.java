package Quetions.BinarySearch.medium;

public class FindNthRootOfANumber {
    public static int NthRoot(int n, int m) {
        int count = 1;
        int pow = n;
        for (int i = 3; i < m; i += 3) {
            if (pow <= m) {
                pow *= i;
                count++;
            } else {
                break;
            }
        }
        if (Math.pow(n, count) == m) {
            return count;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 27;
        System.out.println(FindNthRootOfANumber.NthRoot(n, m));
    }
}
