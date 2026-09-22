package Quetions.Arrays.Easy;

import java.util.Arrays;
import java.util.ArrayList;

/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.

Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/
public class Remove_duplicate_from_sorted {
    public static int[] removeDuplicate(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(nums[0]);
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j - 1]) {
                arr.add(nums[j]);
            }
        }
        int[] uniqueArray = new int[arr.size()];
        for (int i = 0; i < uniqueArray.length; i++) {
            uniqueArray[i] = arr.get(i);
        }
        return uniqueArray;

    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 3, 3, 5, 6 };
        System.out.println(Arrays.toString(Remove_duplicate_from_sorted.removeDuplicate(arr)));
        int[] result = Remove_duplicate_from_sorted.removeDuplicate(arr);
        System.out.println("Number of Unique elements are " + (result.length - 1));
    }
}

/*
 * one bad approuch is, get the array, convert to arrayList, put the first
 * element of array into arraylist
 * 
 * for(int i=1;i<arr.length; i++)->
 * if arr(i)!= arr(i-1)-> arraylist.add(i) ;
 * else-> continue
 * 
 * again a for loop to create a result new array of only unique elements
 * 
 * return resultant array.
 * time-complexity -> o(n)
 * spcae-complexity-> o(n)+auxilary space(constants);
 * 
 * 
 * 
 * 
 * and the above have
 * time-complexity -> o(n)
 * space-complexity ->o(1)
 * 
 */