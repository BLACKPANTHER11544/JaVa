package Quetions.Hashing.medium;

import java.util.HashMap;
import java.util.Map ; 


public class CountSubarraysWithGivenXorK {
    
    public static int subarraysWithXorK(int[] nums, int k) {
      int count = 0 ;
      for(int i=0 ;i<nums.length;i++){
        int sum = 0 ; 
        for(int j=i ; j<nums.length;j++){
            sum = sum ^ nums[j]; 
            if(sum == k){
                count++ ; 
            }
        }
      }
      return count  ;
    }

    public static int subarraysWithXorK1(int[] nums, int k){
        Map<Integer, Long> result = new HashMap<>();

        result.put(0, 1L);
 
        int prefix = 0;
        long count = 0;
        for (int value : nums) {
            prefix ^= value;
            int neededXor = prefix ^ k;
            if (result.containsKey(neededXor)) {
                count += result.get(neededXor);
            }
            result.put(
                prefix,
                result.getOrDefault(prefix, 0L) + 1
            );
        }
 
        return  (int )count;
    }
    
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4} ; 
        int k =6; 
        System.out.println(CountSubarraysWithGivenXorK.subarraysWithXorK1(arr, k));

    }
}
