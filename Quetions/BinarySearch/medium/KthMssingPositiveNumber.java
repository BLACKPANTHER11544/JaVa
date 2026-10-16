package Quetions.BinarySearch.medium;

import java.util.ArrayList;

public class KthMssingPositiveNumber {
    // t.c -> O(n) if k<n, and O(k) if k>n , s.c -> O(arr.length-1+k)
    public static int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            arr1.add(arr[i]);
        }
        int i = 1;
        while (ans.size() < k) {
            if (!arr1.contains(i)) {
                ans.add(i);
            }
            i++;
        }
        int result = ans.get(k - 1);
        System.out.println(ans);

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 10 };
        int k = 6;
        System.out.println(KthMssingPositiveNumber.findKthPositive(arr, k));
    }
}
