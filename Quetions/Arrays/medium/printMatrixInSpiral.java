package Quetions.Arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class printMatrixInSpiral {
    public static List<Integer> spiralOrder(int[][] arr) {
        List<Integer> result = new ArrayList<>();
        int row = arr.length;
        int column = arr[0].length;
        int top = 0;
        int down = row - 1;
        int left = 0;
        int right = column - 1;
        int dir = 0;
        while (top <= down && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    result.add(arr[top][i]);
                }
                top++;
            }
            if (dir == 1) {
                for (int i = top; i <= down; i++) {
                    result.add(arr[i][right]);
                }
                right--;
            }
            if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    result.add(arr[down][i]);
                }
                down--;
            }
            if (dir == 3) {
                for (int i = down; i >= top; i--) {
                    result.add(arr[i][left]);
                }
                left++;
            }
            if (dir > 3) {
                dir = 0;
            }
            dir = (dir + 1) % 4;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(printMatrixInSpiral.spiralOrder(arr));
    }
}
