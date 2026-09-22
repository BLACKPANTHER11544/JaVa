package Quetions.Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class leftRotateByK {

    // public static void rotateArray(int[] arr, int k) {
    // k = k % arr.length;
    // ArrayList<Integer> arraylist = new ArrayList<>();
    // for (int i = 0; i < k; i++) {
    // arraylist.add(arr[i]);
    // }
    // for (int i = k; i < arr.length; i++) {
    // arr[i - k] = arr[k];
    // }

    // for (int i = 0; i < k; i++) {
    // arr[arr.length - k + i] = arraylist.get(i);

    // }
    // System.out.println(Arrays.toString(arr));
    // }

    // public static void main(String[] args) {
    // int[] arr = { 1, 2, 3, 4, 5 };
    // rotateArray(arr, 2);
    // }

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;

        ArrayList<Integer> arraylist = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            arraylist.add(arr[i]);
        }
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = arraylist.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        rotateArray(arr, 2);
    }

}