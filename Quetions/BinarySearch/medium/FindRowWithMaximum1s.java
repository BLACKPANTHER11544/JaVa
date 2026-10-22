package Quetions.BinarySearch.medium;

public class FindRowWithMaximum1s {
    public static int rowWithMax1s(int[][] mat) {
        // t.c -> O(mn) , s.c-> O(1);
        int maxcount = 0;
        int index = -1;
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                    if (count > maxcount) {
                        maxcount = count;
                        index = i;
                    }
                } else {
                    continue;
                }
            }
        }
        return index;
    }

    // t.c -> O(nlog(m)) , s.c -> O(1);
    public static int rowWithMax1s1(int[][] mat) {
        int maxcount = 0;
        int index = -1;
        for (int i = 0; i < mat.length; i++) {
            int count;
            count = binarySearch(mat[i]);
            if (count > maxcount) {
                maxcount = count;
                index = i;
            } else {
                continue;
            }
        }
        return index;
    }

    public static int binarySearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;
        ;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == 1) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr.length - ans;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 1 }, { 0, 0, 1 }, { 0, 0, 0 } };
        System.out.println(FindRowWithMaximum1s.rowWithMax1s1(arr));

    }

}
