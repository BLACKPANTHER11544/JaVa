package Quetions.Arrays.medium;

import java.util.Arrays;

public class Next_permutation {
    public static int[] nextPermutation(int[] nums) {
        int gola_index = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                gola_index = i - 1;
                break;
            }
        }
        if (gola_index != -1) {
            int swap_index = gola_index;
            for (int i = nums.length - 1; i > gola_index; i--) {
                if (nums[i] > nums[gola_index]) {
                    swap_index = i;
                    break;
                }
            }
            swap(nums, gola_index, swap_index);

            reverse(nums, gola_index);
        } else {
            reverseAll(nums);
        }
        return nums;
    }

    public static void reverse(int[] arr, int start_index) {
        int start = start_index + 1;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void reverseAll(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1 };
        Next_permutation.nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}

/*
 * 1. loop, start from arr.length-1 (peeche se)
 * 2. jahan pe arr[i-1]<arr[i], wahan pe arr[i-1] ko fix ker denge,
 * 3. fixed element ke index se leke arr.length kat main jo
 * number first number jo greater than fixed element hoga usko swap kerdenge.
 * 4. aakhir main fixed_index+1 se arr.length-1 tak ke elements ko reverse ker
 * denge.
 * 
 * 
 * 
 * 
 */