package Quetions.BinarySearch.medium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MedianOf2SortedArray {
    // t.c -> O(n)+O(m)+O(zlogz)=> O(zlogz) , s.c -> O(z) ;
    public static double median(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            result.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            result.add(arr2[i]);
        }
        Collections.sort(result);
        int start = 0;
        int end = result.size() - 1;
        int mid = start + (end - start) / 2;
        if (result.size() % 2 == 0) {
            return (double) (result.get(mid) + result.get(mid + 1)) / 2;
        } else {
            return (double) result.get(mid);
        }
    }

    // t.c -> O(mid) is average and at worst O(m+n), s.c-> O(1), much better than
    // t.c-> O(zlogz) and s.c-> O(m+n)
    public static double median1(int[] arr1, int[] arr2) {
        // check the number of elements odd/even ;
        int n = arr1.length;
        int m = arr2.length;
        int total = n + m;
        int mid = total / 2;
        int i = 0;
        int j = 0;
        int prev = 0;
        int curr = 0;
        for (int k = 0; k <= mid; k++) {
            prev = curr;
            if (i < n && (j >= m || arr1[i] <= arr2[j])) {
                curr = arr1[i];
                i++;
            } else {
                curr = arr2[j];
                j++;
            }
        }
        if (total % 2 != 0) {
            return (double) curr;
        }
        return (double) (prev + curr) / 2.0;

    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 4, 6 };
        int[] arr2 = { 1, 3, 5 };
        System.out.println(MedianOf2SortedArray.median1(arr1, arr2));
    }
}
