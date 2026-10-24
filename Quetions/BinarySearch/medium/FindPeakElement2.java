package Quetions.BinarySearch.medium;

import java.util.Arrays;

public class FindPeakElement2 {
    // t.c -> O(log(mn)) , s.c-> O(1)
    public static int[] findPeakGrid(int[][] mat) {
        int start = 0;
        int end = mat[0].length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int maxElementrow = findMax(mat, mid);
            int left = mid - 1 >= 0 ? mat[maxElementrow][mid - 1] : -1;
            int right = mid + 1 < mat[0].length ? mat[maxElementrow][mid + 1] : -1;
            if (mat[maxElementrow][mid] > left && mat[maxElementrow][mid] > right) {
                return new int[] { maxElementrow, mid };
            } else if (mat[maxElementrow][mid] < left) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return new int[] { -1 - 1 };

    }

    public static int findMax(int[][] arr, int mid) {
        int maxElement = Integer.MIN_VALUE;
        int index = -1;
        int rows = arr.length - 1;
        for (int i = 0; i <= rows; i++) {
            if (arr[i][mid] > maxElement) {
                maxElement = arr[i][mid];
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[][] arr = { { 10, 20, 15 }, { 21, 30, 14 }, { 7, 16, 32 } };
        System.out.println(Arrays.toString(FindPeakElement2.findPeakGrid(arr)));
    }
}
