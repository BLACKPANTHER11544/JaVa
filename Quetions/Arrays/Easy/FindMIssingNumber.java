
import java.util.Arrays;

public class FindMIssingNumber {
    // tc -> o(n^2) and sc-> o(1), very bad answer (brute force);
    public static int MissingNumber(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return arr.length + 1;
        }
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] != arr[i] + 1) {
                return arr[i] + 1;
            }
        }
        return arr[arr.length - 1] + 1;

    }

    // tc -> o(n) and sc->(1) without even touching the arr.
    public static int MissingNumber1(int[] arr) {
        int sum = 0;
        int n = arr.length;
        int expected_sum = (n * (n + 1)) / 2;
        System.out.println(expected_sum);
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);

        return expected_sum - sum;
    }

    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last_index = arr.length - 1 - i;
            int MaxElement_index = getMaxElementIndex(arr, 0, last_index);
            swap(arr, MaxElement_index, last_index);
        }

    }

    public static int getMaxElementIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int max, int end) {
        int temp = arr[max];
        arr[max] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 4, 5, 6 };
        // System.out.println(FindMIssingNumber.MissingNumber(arr))
        System.out.println(FindMIssingNumber.MissingNumber1(arr));

    }
}

// if arr[i+1] - arr[i] != 1 , then result arr[i]+1