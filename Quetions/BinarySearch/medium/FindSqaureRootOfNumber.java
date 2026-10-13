package Quetions.BinarySearch.medium;

public class FindSqaureRootOfNumber {
    // t.c -> O(n) , s.c-> O(1)
    public static int SqrtRoot1(int number) {
        int ans = 1;
        for (int i = 1; i <= number; i++) {
            if ((long) i * i <= number) {
                ans = i;
            } else {
                break;
            }
        }
        return ans;
    }

    // t.c -> O(log(n)) s.c -> O(1)
    public static int SqrtRoot(int number) {
        int start = 1;
        int end = number;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((long) mid * mid <= number) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 36;
        System.out.println(FindSqaureRootOfNumber.SqrtRoot1(num));
    }
}