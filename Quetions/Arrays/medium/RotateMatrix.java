package Quetions.Arrays.medium;

import java.util.Arrays;

public class RotateMatrix {
    // t.c-> O(n^2) and s.c-> o(1)
    public static int[][] rotateMatrix(int[][] matrix) {
        int m = matrix.length;
        for (int i = 0; i < m; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                // swap(matrix[i][j], matrix[j][i]);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < m; i++) {
            reverse(matrix[i]);
        }

        return matrix;
    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // swap(arr[start], arr[end]);
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // public static void swap(int n1, int n2) {
    // int temp = n1;
    // n1 = n2;
    // n2 = temp;
    // }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(Arrays.deepToString(RotateMatrix.rotateMatrix(arr)));
    }
}

//