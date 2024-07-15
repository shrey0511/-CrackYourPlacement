//https://leetcode.com/problems/find-the-duplicate-number/

public class FindTheDuplicate_287 {
    public static void main(String[] args) {
        
    }

    //Without modifying the original array
    static int findDuplicate(int[] nums){
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];//Moves quicker
        } while (slow != fast);
        //Now the slow and fast pointer met so reset fast pointer and now
        //Move both the pointers with the same speed, we will find the duplicate
        fast = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }


    //Cycle Sort since we are talking about elements from 1 to n
    static int findDuplicateCycleSort(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] != i+1){
                //Wrong one so find if the correct place has this or not
                //If not then swap otherwise we got our duplicate
                int correct = nums[i]-1;
                if(nums[correct] != nums[i]){
                    swap(nums, i, correct);
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
