//https://leetcode.com/problems/move-zeroes/

public class MoveZeroes_283 {
    public static void main(String[] args) {
        
    }

    static void moveZeroes(int[] nums) {
        int n = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                swap(nums , i , n++);
            }
        }
        return;
    }
    static void swap(int[] arr , int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
