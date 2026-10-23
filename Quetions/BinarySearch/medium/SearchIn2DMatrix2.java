package Quetions.BinarySearch.medium;

public class SearchIn2DMatrix2 {
    // t.c -> not exactly n(logm) as it will skip rows where arr[i][0] > target.
    // but still t.c -> O(nlogm) , s.c -> O(1);
    public static boolean searchMatrix(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] <= target && target <= arr[i][arr[i].length - 1]) {
                boolean check = isTrue(arr[i], target);
                if (check) {
                    return true;
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    // t.c -> O(m+n) , s.c -> O(1);
    public static boolean searchMatrix1(int[][] arr, int target) {
        int row = arr.length;
        int col = arr[0].length;
        int i = 0;
        int j = col - 1;
        while (i < row && j >= 0) {
            if (arr[i][j] == target) {
                return true;
            } else if (arr[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    public static boolean isTrue(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        int target = 5;
        System.out.println(SearchIn2dMatrix.searchMatrix(arr, target));
    }
}
