package Quetions.Arrays.Easy;
/*

Check if the Array is Sorted II
Given an array nums of n integers, return true if the array nums is sorted in non-decreasing order or else false.
Example 1
Input : nums = [1, 2, 3, 4, 5]
Output : true
Explanation : For all i (1 <= i <= 4) it holds nums[i] <= nums[i+1], hence it is sorted and we return true.
Example 2
Input : nums = [1, 2, 1, 4, 5]
Output : false
Explanation : For i == 2 it does not hold nums[i] <= nums[i+1], hence it is not sorted and we return false.

*/

import java.util.ArrayList;

import java.util.List;

public class CheckIfSortedArray {
    public static boolean isSorted(ArrayList<Integer> arr) {
        ArrayList<Integer> nums = new ArrayList<>(arr);
        nums = BubbleSort(nums);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals(nums.get(i))) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> BubbleSort(ArrayList<Integer> arr) {
        int temp;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - 1 - i; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
        return arr;
    }

    public static boolean isSorted1(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arry = new ArrayList<Integer>(List.of(1, 2, 4, 5));
        // this is taking O(n^2) tc, and spaceComplexity is O(n), hence not the best
        // approuch
        // System.out.println(CheckIfSortedArray.isSorted(arry));

        // this is better as tc of this is o(n) and sc is o(1);
        System.out.println(CheckIfSortedArray.isSorted1(arry));
    }
}
