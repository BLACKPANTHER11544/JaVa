package Quetions.Recursion.easy;

import java.util.ArrayList;
import java.util.List;

public class checkIfArrayisSorted {
    public static boolean checkSorted(ArrayList<Integer> nums) {
        return solve(nums, 1);
    }

    public static boolean solve(ArrayList<Integer> nums, int index) {
        if (index == nums.size()) {
            return true;
        }
        if (!(nums.get(index) >= nums.get(index - 1))) {
            return false;
        }
        return solve(nums, index + 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(1, 2, 6, 4, 5));
        System.out.println(checkIfArrayisSorted.checkSorted(nums));
    }
}
