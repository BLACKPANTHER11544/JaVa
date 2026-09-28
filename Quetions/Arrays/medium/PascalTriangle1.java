package Quetions.Arrays.medium;

/*
Given an integer r, return all the values in the rth row (1-indexed) in Pascal's Triangle in correct order.

In Pascal's triangle:

The first row has one element with a value of 1.
Each row has one more element in it than its previous row.
The value of each element is equal to the sum of the elements directly above it when arranged in a triangle format.
Example 1:
Input: r = 4

Output: [1, 3, 3, 1]

Explanation:

The Pascal's Triangle is as follows:

1

1 1

1 2 1

1 3 3 1

....

Thus the 4th row is [1, 3, 3, 1]

*/
import java.util.ArrayList;
import java.util.Arrays;

public class PascalTriangle1 {
    // not the best approuch as the fact functoin will have to deal with huge
    // numbers
    public static int[] pascalTriangleII(int r) {
        int n = r - 1;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            result.add(nCr(n, i));
        }
        int[] returnarr = new int[result.size()];
        for (int i = 0; i < returnarr.length; i++) {
            returnarr[i] = result.get(i);
        }
        return returnarr;
    }

    public static int nCr(int n, int r) {
        if (r < 0 || r > n) {
            return 0;
        }
        return fact(n) / (fact(r) * fact(n - r));
    }

    public static int fact(int num) {
        if (num < 0) {
            return -1;
        }
        if (num == 0 || num == 1) {
            return 1;
        }
        int result = 1;
        for (int i = num; i > 0; i--) {
            result = result * i;
        }
        return result;
    }

    // this is better approuch as this doesn't have to deal with all the huge
    // factmehthod numbers
    public static int[] pascalTriangleII1(int r) {
        int n = r - 1;// converted from 1 based index to 0 based index.
        int[] result = new int[r];
        for (int i = 0; i <= n; i++) {
            result[i] = (int) nCr1(n, i);
        }
        return result;
    }

    public static long nCr1(int n, int c) {
        if (c < 0 || c > n) {
            return 0;
        }
        if (c > n - c) {
            c = n - c;
        }
        long temp = 1;
        for (int i = 0; i < c; i++) {
            temp = temp * (n - i);
            temp = temp / (i + 1);
        }
        return temp;
    }

    public static void main(String[] args) {
        int r = 14;
        System.out.println(Arrays.toString(PascalTriangle1.pascalTriangleII1(r)));
    }

}
