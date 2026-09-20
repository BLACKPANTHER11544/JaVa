package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void Sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 4, 0 };
        InsertionSort.Sort(arr);
    }
}
