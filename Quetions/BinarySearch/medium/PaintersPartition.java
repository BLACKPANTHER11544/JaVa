package Quetions.BinarySearch.medium;

// Ghode khul gaye problem. 
// for referrence watch video-> https://www.youtube.com/watch?v=srsFN5OHBgw
public class PaintersPartition {
    // t.c -> O(log(end-start)*C.length), s.c -> O(1);
    public static int paint(int A, int B, int[] C) {
        int start = 0;
        int end = 0;
        for (int i : C) {
            start = Math.max(start, i);
            end += i;
        }
        int ans = start;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (IsPossible(A, C, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans * B;
    }

    public static boolean IsPossible(int NumberOfPainters, int[] arr, int maxTime) {
        int painter = 1;
        int timeTaken = 0;
        for (int i = 0; i < arr.length; i++) {
            if (timeTaken + arr[i] <= maxTime) {
                timeTaken += arr[i];
            } else {
                painter++;
                timeTaken = arr[i];
            }
        }
        return painter <= NumberOfPainters;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 11, 3 };
        int A = 10;
        int B = 1;
        System.out.println(PaintersPartition.paint(A, B, arr));
    }
}