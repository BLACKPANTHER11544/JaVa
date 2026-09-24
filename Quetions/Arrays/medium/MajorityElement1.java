package Quetions.Arrays.medium;

public class MajorityElement1 {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int maj = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                maj = nums[i];
            } else if (nums[i] == maj) {
                count++;
            } else {
                count--;
            }
        }
        return maj;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 0, 0, 1, 7, 7, 2, 7, 7 };
        System.out.println(MajorityElement1.majorityElement(arr));
    }
}
