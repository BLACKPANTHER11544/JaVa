package Quetions.BinarySearch.medium;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int x) {
        int start = 0;
        int end = nums.length - 1;
        int result = nums.length;
        while (start <= end) {
            int medium = start + (end - start) / 2;
            if (nums[medium] >= x) {
                result = medium;
                end = medium - 1;
            } else {
                start = medium + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6 };
        int target = 2;
        System.out.println(SearchInsertPosition.searchInsert(arr, target));
    }
}
