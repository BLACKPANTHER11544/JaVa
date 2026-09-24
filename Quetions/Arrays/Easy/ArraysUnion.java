
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysUnion {

    public static int[] Union(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (!(result.contains(arr1[i]))) {
                result.add(arr1[i]);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (!(result.contains(arr2[i]))) {
                result.add(arr2[i]);
            }
        }
        int[] returnarray = new int[result.size()];
        for (int i = 0; i < returnarray.length; i++) {
            returnarray[i] = result.get(i);
        }
        sort(returnarray);
        return returnarray;

    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int maxEleIndex = getIndex(arr, 0, last);
            swap(arr, maxEleIndex, last);
        }
    }

    public static int getIndex(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr1 = { 1, 2, 7 };
        System.out.println(Arrays.toString(ArraysUnion.Union(arr, arr1)));
    }
}
