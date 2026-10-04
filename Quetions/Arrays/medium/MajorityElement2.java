package Quetions.Arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    public static List<Integer> majorityElementTwo(int[] nums) {
        int count1 = 0;
        int maj1 = 0;
        int count2 = 0;
        int maj2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == maj1) {
                count1++;
            } else if (nums[i] == maj2) {
                count2++;
            } else if (count1 == 0) {
                maj1 = nums[i];
                count1++;
            } else if (count2 == 0) {
                maj2 = nums[i];
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        List<Integer> result = new ArrayList<>();
        int freq1 = 0;
        int freq2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == maj1) {
                freq1++;
            } else if (nums[i] == maj2) {
                freq2++;
            }
        }
        if (freq1 > (int) (nums.length / 3)) {
            result.add(maj1);
        }
        if (freq2 > (int) (nums.length / 3)) {
            result.add(maj2);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 1, 3, 2, 2 };
        System.out.println(MajorityElement2.majorityElementTwo(arr));
    }
}
