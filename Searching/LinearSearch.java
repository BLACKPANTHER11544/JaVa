package Searching;

public class LinearSearch {
    // bekar hai, good for small values of n, t.c -> O(n), s.c -> O(1)
    public static int LS(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 11;
        System.out.println(LinearSearch.LS(arr, target));
    }
}
