
import java.util.Arrays;

/**
 * MaximumConsecutive1sBinary
 */
public class MaximumConsecutive1sBinary {
    // this following answer is incorrect as this is distorting the order of the
    // array
    // elements,
    // as you are sorting the array.
    public static int CountConsecutive1s(int[] arr) {
        BubbleSort(arr);
        int temp = 0;
        if (arr.length == 0 || arr == null) {
            return 0;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 1) {
                temp = i + 1;
            } else {
                continue;
            }
        }
        if (temp == 0) {
            if (arr[0] == 1) {
                return arr.length;
            } else {
                return 0;
            }
        }
        return ((arr.length - 1) - temp) + 1;
    }

    public static void BubbleSort(int[] arr) {
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
        System.out.println(Arrays.toString(arr));
    }

    // this is better approch and also, deals with all the edge cases, arr=[0,0,0],
    // and this is also tc=o(n), sc=o(1);
    public static int CountOne(int[] arr) {
        int currentCount = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 0, 1, 1, 1, 0 };
        System.out.println(Arrays.toString(arr));
        System.out.println(MaximumConsecutive1sBinary.CountOne(arr));
    }
}
