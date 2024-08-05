//https://leetcode.com/problems/missing-number/

public class MissingNum_268 {
    public static void main(String[] args) {
        
    }

    public int missingNumber(int[] nums) {
        //Cycle sort
        int i = 0;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i]<nums.length && nums[i] != nums[correct]){
                swap(nums , i , correct);
            }else{
                i++;
            }
        }

        for(i = 0 ; i<nums.length ; i++ ){
            if(nums[i] != i)
                return i;
        }
        return nums.length;
    }

    public void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
