//https://leetcode.com/problems/majority-element/

public class MajorityElement_169 {
    public static void main(String[] args) {
        
    }

    public int majorityElement(int[] nums) {
        int count = 0 , candidate = 0;
        for(int num : nums){
            if(count == 0)
                candidate = num;
            if(num == candidate)
                count++;
            else
                count--;
        }
        return candidate;
    }
}
