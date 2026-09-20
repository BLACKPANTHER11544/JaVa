package sorting;

import java.util.Arrays;

public class Ssort {

    // public static void SelSort(int[] arr) {
    // int temp;
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr.length - 1; j++) {
    // if (arr[j] > arr[j + 1]) {
    // temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // } else {
    // continue;
    // }
    // }
    // }
    // System.out.print(Arrays.toString(arr));

    // }

    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last_index = arr.length - 1 - i;
            int Max_element_index = getMaximum(arr, 0, last_index);
            swap(arr, Max_element_index, last_index);
        }
        System.out.print(Arrays.toString(arr));
    }

    public static int getMaximum(int[] arr, int start, int last) {
        int max_value_index = start;
        for (int i = start; i <= last; i++) {
            if (arr[max_value_index] < arr[i]) {
                max_value_index = i;
            }
        }
        return max_value_index;
    }

    public static void swap(int[] arr, int Max_element_index, int last_index) {
        int temp = arr[Max_element_index];
        arr[Max_element_index] = arr[last_index];
        arr[last_index] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 4, 0 };
        Ssort.SelectionSort(arr);
    }
}
