package Quetions.BinarySearch.medium;

public class SearchIn2dMatrix {
    // t.c-> O(mn) s.c -> O(1);
    public static boolean searchMatrix(int[][] mat, int target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // t.c -> O(nlog(m)) s.c-> O(1);
    public static boolean searchMatrix1(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (isTrue(arr[i], target)) {
                return true;
            } else {
                continue;
            }
        }
        return false;
    }
    // t.c -> here O(nlog(m)) is almost equal to O(n) (O(nlogm)==O(n))as the Ologm
    // is happing only once, s.c ->

    public static boolean searchMatrix2(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            // this will skip rows based on, if the target can lie in between the arr[i] of
            // arr[][] ;
            if (arr[i][0] <= target && target <= arr[i][arr[i].length - 1]) {
                return isTrue(arr[i], target);
            }
        }
        return false;
    }

    // t.c -> O(log(nm)) s.c -> O(1);
    public static boolean searchMatrix3(int[][] arr, int target) {
        int n = arr.length;
        int m = arr[0].length;
        int start = 0;
        int end = n * m - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int row = mid / m;
            int col = mid % m;
            if (arr[row][col] == target) {
                return true;
            } else if (arr[row][col] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
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
        System.out.println(SearchIn2dMatrix.searchMatrix2(arr, target));
    }
}
