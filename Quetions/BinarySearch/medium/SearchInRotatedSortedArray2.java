package Quetions.BinarySearch.medium;

public class SearchInRotatedSortedArray2 {
    // t.c -> O(log(n)) , s.c -> O(1)
    public static boolean searchInARotatedSortedArrayII(int[] nums, int k) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == k) {
                return true;
            }
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            } else if (nums[start] <= nums[mid]) {
                if (nums[start] <= k && k <= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] < k && k <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 1, 2, 3, 3, 3, 4, 5, 6 };
        int target = 6;
        System.out.println(SearchInRotatedSortedArray2.searchInARotatedSortedArrayII(arr, target));
    }
}
