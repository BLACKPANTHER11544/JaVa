package Searching;

public class BinarySearch {
    // tc-> log(n) s.c -> o(1)
    public static int BS(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -2;
        }
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int medium = start + (end - start) / 2;
            if (arr[medium] == target) {
                return medium;
            } else if (arr[medium] > target) {
                end = medium - 1;
            } else {
                start = medium + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {};
        int target = 7;
        System.out.println(BinarySearch.BS(arr, target));
    }
}

/*
 * 
 * start = 0
 * end = arr.length -1,
 * medium = (end - start)/2 ;
 * 
 * while(start<end){
 * 
 * }
 * 
 * if(arr[medium] == target){
 * return medium ;
 * }
 * 
 * else if (arr[medium]> target){
 * end = medium-1;
 * }
 * else if(arr[medium] < target){
 * start = medium+1 ;
 * 
 * }
 * 
 * 
 */