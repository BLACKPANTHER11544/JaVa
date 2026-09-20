package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void Bsort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else {
                    continue;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 4, 2 };
        BubbleSort.Bsort(arr);
    }
}
