//https://leetcode.com/problems/subarray-sum-equals-k/

import java.util.HashMap;

public class SubArraySumEqualsK_560 {
    public static void main(String[] args) {
        
    }

    public int subArraySum(int[] arr , int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0 , count = 0;

        for(int x : arr){
            sum += x;
            if(map.containsKey(sum - k)){
                count += map.get(sum-k);
            }
            map.put(sum , map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}
