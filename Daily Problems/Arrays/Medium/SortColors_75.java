//https://leetcode.com/problems/sort-colors/

public class SortColors_75 {
    public static void main(String[] args) {
        
    }

    static void sortColors(int[] nums) {
        int start = 0 , end = nums.length-1;

        int i = 0;
        while(i < nums.length){
            if(i > end) break;

            if(nums[i] == 0){
                swap(nums,i++,start++);
            }else if(nums[i] == 1){
                i++;
            }else{
                swap(nums,i,end--);
            }
        }
        return;
    }
    static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
