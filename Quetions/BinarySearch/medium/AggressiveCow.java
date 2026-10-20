package Quetions.BinarySearch.medium;

import java.util.Arrays;

public class AggressiveCow {
    // t.c -> O(max-min)*n , s.c -> O(1) ;
    public static int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        int maxDistance = arr[arr.length - 1] - arr[0];
        for (int i = 1; i < maxDistance; i++) {
            if (!(isPossible(arr, maxDistance, k))) {
                return i - 1;
            }
        }
        return maxDistance;
    }

    public static boolean isPossible(int[] arr, int max, int k) {
        int last = arr[0];
        int cowsCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - last >= max) {
                cowsCount++;
                last = arr[i];
            }

        }
        if (cowsCount >= k) {
            return true;
        } else {
            return false;
        }
    }

    // t.c -> O(nlog(n))+O(log(end-start)*n) => O(log(end - start)*n) , s.c-> O(1);
    public static int aggressiveCows1(int[] arr, int k) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr[arr.length - 1] - arr[0];
        for (int i : arr) {
            start = Math.min(start, i);
            end = Math.max(end, i);
        }
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(arr, mid, k)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 3, 6 };
        int cows = 2;
        System.out.println(AggressiveCow.aggressiveCows1(arr, cows));
    }
}
