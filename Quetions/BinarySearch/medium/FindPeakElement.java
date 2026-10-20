package Quetions.BinarySearch.medium;

public class FindPeakElement {
    public static int findPeakElement(int[] arr) {
        // int greater = 0;
        // for (int i = 1; i <= arr.length - 2; i++) {
        // if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
        // greater = i;
        // break;
        // } else {
        // continue;
        // }
        // }
        // return greater;
        int i = 0;
        while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
            i++;
        }
        return i;
    }

    public static int findPeakElement1(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 5, 1 };
        System.out.println(FindPeakElement.findPeakElement(arr));
    }
}
