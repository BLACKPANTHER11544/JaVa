package Quetions.Hashing.medium;
import java.util.Map; 
import java.util.HashMap; 
public class CountSubArrayWithGivenSum {
    // t.c -> O(n^2), s.c -> O(1) ;, brute force
    public static int subarraySum(int[] nums, int k) {
        int count = 0 ; 
        for(int i= 0; i <nums.length ; i++ ){
            int sum = 0 ; 
            for(int j= i; j <nums.length;j++){
                sum+= nums[j] ; 
                if(sum==k){
                    count++ ; 
                }
            }
        }
        return count ; 
    }
    // t.c -> O(n), s.c->(o(n));
     public static int subarraySum1(int[] nums, int k) {
       Map<Long,Integer> result = new HashMap<>() ; 
       result.put(0L,1) ; 
       Long prefixSum = 0L ; 
       int count = 0 ; 
       for(int i=0; i<nums.length; i++){
        prefixSum += nums[i] ;
        Long neededSum = prefixSum - k ;
        if(result.containsKey(neededSum)){
            count += result.get(neededSum) ; 
        }
        result.put(prefixSum, result.getOrDefault(prefixSum, 0)+1); 
       }
       return count ; 
    }
    public static void main(String[] args) {
        int[] arr = {-5,-3,0,-9,-6,1,5,-7,-1,0,3,5,9 };
        int k = 0;
        System.out.println(CountSubArrayWithGivenSum.subarraySum1(arr, k));
    }
}
