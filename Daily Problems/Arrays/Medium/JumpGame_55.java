//https://leetcode.com/problems/jump-game/

public class JumpGame_55 {
    public static void main(String[] args) {
        
    }

    public boolean canJump(int[] nums) {
        if(nums.length == 1) return true;

        int reachable = 0;
        for(int i = 0 ; i <= reachable ; i++){
            reachable = Math.max(reachable , i+nums[i]);
            if(reachable >= nums.length-1)
                return true;
        }
        return false;
    }
}
