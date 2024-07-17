import java.util.HashMap;

class SubArraySumDivisibleByK_974 {
    public static void main(String[] args) {
        
    }   
    
    static int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0 , count = 0;
        map.put(0,1);//Cases when subarrray starts from the beginning

        for(int i = 0 ; i<nums.length ; i++){
            sum += nums[i];
            int mod = (sum % k + k) % k; //For negative values we add and mod again

            count += map.getOrDefault(mod, 0);
            map.put(mod,map.getOrDefault(mod, 0) + 1);
        }
        return count;
    }
}