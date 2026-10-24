package Quetions.BinarySearch.medium;

import java.util.ArrayList;
import java.util.Collections;

public class MatrixMedian {
    // t.c-> O(nm)+O(nlogm) => O(nm) , s.c-> O(nm);
    public static int findMedian(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result.add(matrix[i][j]);
            }
        }
        Collections.sort(result);
        int start = 0;
        int end = result.size() - 1;
        int mid = start + (end - start) / 2;
        return result.get(mid);

    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 3, 8 }, { 2, 3, 4 }, { 1, 2, 5 } };
        System.out.println(MatrixMedian.findMedian(arr));
    }
}
