//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicatesFromSortedArray_26 {
    public static void main(String[] args) {
        
    }

    static int removeDuplicates(int[] nums){
        int i , j = 1;
        for(i=1 ; i<nums.length ; i++){
            if(nums[i] != nums[i-1]){
                //Found different elements put it in front
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
