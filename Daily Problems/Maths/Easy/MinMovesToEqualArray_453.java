//https://leetcode.com/problems/minimum-moves-to-equal-array-elements/

public class MinMovesToEqualArray_453 {
    public static void main(String[] args) {
        
    }

    public int minMoves(int[] nums) {
        if(nums.length <= 1){
            return 0;
        }

        int min = Integer.MAX_VALUE;
        for(int num : nums){
            min = Math.min(min , num);
        }

        int ans = 0;
        for(int num : nums){
            ans += (num-min);
        }

        return ans;
    }
}
