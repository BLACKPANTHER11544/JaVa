package Quetions.Arrays.medium;

import java.util.Arrays;

public class ReArrangeArrayElementBySign {
    // t.c -> o(n) and s.c o(n/2)
    public static int[] rearrangeArray(int[] arr) {
        int[] positive = new int[(arr.length / 2) + 1];
        int[] negative = new int[(arr.length / 2) + 1];
        int positiveCount = 0;
        int negativeCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive[positiveCount] = arr[i];
                positiveCount++;
            } else {
                negative[negativeCount] = arr[i];
                negativeCount++;
            }
        }
        int Pve = 0;
        int Nve = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = positive[Pve];
                Pve++;
            } else {
                arr[i] = negative[Nve];
                Nve++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { -4, 4, -4, 4, -4, 4 };
        System.out.println(Arrays.toString(ReArrangeArrayElementBySign.rearrangeArray(arr)));

    }
}
