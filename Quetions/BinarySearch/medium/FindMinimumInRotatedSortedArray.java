package Quetions.BinarySearch.medium;

import java.util.ArrayList;
import java.util.List;

public class FindMinimumInRotatedSortedArray {
    public static int findMin(ArrayList<Integer> arr) {
        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = arr.size() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.get(start) <= arr.get(mid)) {
                min = Math.min(min, arr.get(start));
                start = mid + 1;
            } else {
                end = mid - 1;
                min = Math.min(min, arr.get(mid));
            }
        }
        return min;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(List.of(4, 5, 6, 7, 8, 1, 2, 3));
        System.out.println(FindMinimumInRotatedSortedArray.findMin(arr));
    }
}
