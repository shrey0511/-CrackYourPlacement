//https://leetcode.com/problems/4sum/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum_18 {
    public static void main(String[] args) {
        
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        if(nums.length < 4)
            return ans;
        for(int i = 0 ; i<nums.length-3 ; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            if(nums[i] > 0 && nums[i] > target) return ans;
            
            for(int j = i+1 ; j<nums.length-2 ; j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int k = j+1 , l = nums.length-1;
                while(k<l){
                    int sum = nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum < target){
                        k++;
                    }else if(sum > target){
                        l--;
                    }else{
                        ans.add(Arrays.asList(new Integer[]{nums[i],nums[j],nums[k],nums[l]}));
                        while(k<l && nums[k]==nums[k+1]) k++;
                        while(k<l && nums[l]==nums[l-1]) l--;
                        k++;
                        l--;
                    }
                }
            }
        }
        return ans;
    }
}
