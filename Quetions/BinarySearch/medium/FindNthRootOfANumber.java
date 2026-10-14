package Quetions.BinarySearch.medium;

public class FindNthRootOfANumber {
    // t.c - > O(m), s.c -> O(m);
    public static int nthRoot(int n, int m) {
        for (int i = 1; i < m; i++) {
            if (Math.pow(i, n) == m) {
                return i;
            }
        }
        return -1;
    }

    // t.c -> log(m) , s.c -> O(1)
    public static int NthRoot(int n, int m) {
        int start = 1;
        int end = m;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (Math.pow(mid, n) == m) {
                return mid;
            } else if (Math.pow(mid, n) < m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 27;
        System.out.println(FindNthRootOfANumber.NthRoot(n, m));
    }
}
