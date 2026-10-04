package Quetions.Arrays.medium;
import java.util.Arrays; 
public class Sort0s1s2s {
 // tc -> nlogn , sc -> O(1) ; 
 public static void sortZeroOneTwo(int[] nums) {
    Arrays.sort(nums);  
 }
// tc-> O(n^2) sc-> O(1) 
 public static void Bsort(int[] arr){
    for(int i=0; i<arr.length ; i++){
        for(int j=0; j<arr.length-1-i; j++){
            if(arr[j]>=arr[j+1]){
               int temp = arr[j] ; 
                arr[j] = arr[j+1] ; 
                arr[j+1] = temp ;
            }
        }
    }
 }
 public static void main(String[] args) {
    int[] arr = {1, 0, 2, 1, 0} ; 
//    Sort0s1s2s.sortZeroOneTwo(arr);
//    System.out.print(Arrays.toString(arr));
   System.out.println("Below Sorted with Bubble Sort") ;
   Sort0s1s2s.Bsort(arr) ;  
   System.out.println(Arrays.toString(arr)); 
 }

}