package Quetions.Arrays.medium;

import java.util.ArrayList;

public class leadersInArray {
    public static ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int max = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                result.add(arr[i]);
            }
        }
        int end = result.size() - 1;
        int start = 0;
        while (end > start) {
            swap(result, start, end);
            start++;
            end--;
        }
        return result;
    }

    public static void swap(ArrayList<Integer> arr, int start, int end) {
        int temp = arr.get(start);
        arr.set(start, arr.get(end));
        arr.set(end, temp);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 3, 1, 2 };

        System.out.print(leadersInArray.leaders(arr));
    }
}
