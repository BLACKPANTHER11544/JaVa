
import java.util.Arrays;

/*
Second Largest Element
Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.

Example 1
Input: nums = [8, 8, 7, 6, 5]
Output: 7
Explanation:
The largest value in nums is 8, the second largest is 7
Example 2
Input: nums = [10, 10, 10, 10, 10]
Output: -1
Explanation:
The only value in nums is 10, so there is no second largest value, thus -1 is returned

*/

public class SecondLargestNumber {
    // sort the array, and return the arr.length-2 element if arr.length-1 !=
    // arr.length-2
    public static int SLN(int[] arr) {
        int[] sortedArr = BubbleSort(arr);
        for (int i = sortedArr.length - 1; i > 0; i--) {
            if ((sortedArr[i] > sortedArr[i - 1]) && (sortedArr[i] != sortedArr[i - 1])) {
                return sortedArr[i - 1];
            } else {
                continue;
            }
        }
        return -1;
    }

    public static int[] BubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 10, 10, 10, 10 };
        System.out.println(Arrays.toString(SecondLargestNumber.BubbleSort(arr)));
        System.out.println(SLN(arr));
    }
}
