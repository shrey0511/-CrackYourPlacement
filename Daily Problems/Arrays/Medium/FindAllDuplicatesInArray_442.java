//https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray_442 {
    public static void main(String[] args) {
        
    }

    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        //Since the elements are from 1 to n we will use cycle sort
        for(int i = 0 ; i<nums.length;){
            int correct = nums[i]-1;

            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }

        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i] != i+1){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
    private static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
