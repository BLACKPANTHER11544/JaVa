package Quetions.BinarySearch.medium;

public class CountOccurenceInSortedArray {
    public static int countOccurence(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    // t.c -> log(n) s.c -> O(1)
    public static int CountOccurence(int[] arr, int target) {
        int First = lowerBound(arr, target);
        if (First == arr.length || arr[First] == arr.length) {
            return 0;
        }
        return UpperBound(arr, target) - First;
    }

    public static int lowerBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        int result = arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    public static int UpperBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        int result = arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 3 };
        int target = 1;
        System.out.println(CountOccurenceInSortedArray.countOccurence(arr, target));
    }
}
