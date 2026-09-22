package Quetions.Arrays.Easy;

import java.util.Arrays;

public class LeftRotateByOne {
    public static int[] LeftRotate(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 0, 3, 6 };
        System.out.println(Arrays.toString(LeftRotate(arr)));
    }
}
