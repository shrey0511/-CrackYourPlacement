//https://leetcode.com/problems/3sum/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_15 {
    public static void main(String[] args) {
        
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        quickSort(nums,0,nums.length-1);

        if(nums.length < 3)
            return ans;
        for(int i = 0 ; i<nums.length-2 ; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1 , k = nums.length-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0){
                    j++;
                }else if(sum > 0){
                    k--;
                }else{
                    ans.add(Arrays.asList(new Integer[]{nums[i],nums[j],nums[k]}));
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        return ans;
    }

    public void quickSort(int[] nums , int start , int end){
        if(start >= end)
            return;

        int mid = start + (end-start) / 2;
        int pivot = nums[mid];

        int low = start , high = end;
        while(low <= high){
            while(nums[low] < pivot){
                low++;
            }
            while(nums[high] > pivot){
                high--;
            }
            if(low <= high){
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;high--;
            }
        }
        quickSort(nums,start,high);
        quickSort(nums,low,end);
    }
}
