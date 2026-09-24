
import java.util.Arrays;

public class MoveZeroToEnd {
    // this has tc -> O(n) and Sc->O(n) ;
    public static int[] moveZeroes(int[] nums) {
        int[] arr = new int[nums.length];
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                arr[counter] = nums[i];
                counter++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
        return nums;
    }

    // better approch as tc=O(n) and Sc= O(1) ;
    public static int[] moveZeros1(int[] nums) {
        int insertPosition = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPosition] = nums[i];
                insertPosition++;
            }
        }
        for (int i = insertPosition; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 1, 3, -2 };
        System.out.println(Arrays.toString(MoveZeroToEnd.moveZeroes(arr)));
        System.out.println(Arrays.toString(MoveZeroToEnd.moveZeros1(arr)));
    }
}
