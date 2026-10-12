package Quetions.BinarySearch.medium;

import java.util.ArrayList;
import java.util.List;

public class FindHowManyTimesArrayIsRotated {
    // t.c - > O(n) and s.c -> O(1) ;
    public static int findKRotation(ArrayList<Integer> nums) {
        if (nums == null || nums.size() == 0) {
            return 0;
        }

        return findPivott1(nums);

    }

    // t.c -> O(log(n)), s.c -> O(1)
    public static int findPivott1(ArrayList<Integer> nums) {
        int start = 0;
        int end = nums.size() - 1;
        int minValue = (int) Integer.MAX_VALUE;
        int index = -1;
        while (start <= end) {
            if (nums.get(start) <= nums.get(end)) {
                if (nums.get(start) < minValue) {
                    minValue = nums.get(start);
                    index = start;
                }
                break;
            }
            int med = start + (end - start) / 2;
            if (nums.get(start) <= nums.get(med)) {
                if (nums.get(start) < minValue) {
                    minValue = nums.get(start);
                    index = start;
                }
                start = med + 1;
            } else {
                if (nums.get(med) < minValue) {
                    minValue = nums.get(med);
                    index = med;
                }
                end = med - 1;
            }
        }
        return index;
    }

    public static int findPivott(ArrayList<Integer> nums) {
        int minValue = nums.get(0);
        int index = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) < minValue) {
                minValue = nums.get(i);
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(List.of(0, 1, 2, 3, 4, 5, 6, 7));
        System.out.println(FindHowManyTimesArrayIsRotated.findKRotation(arr));
    }
}

/*
 * 1,2,3,4,5
 * i =0, j=1
 * i=1 , j= 2 ,
 * i=2, j= 3
 * i=3, j=4
 * i=4, j=5
 * 
 * 
 */