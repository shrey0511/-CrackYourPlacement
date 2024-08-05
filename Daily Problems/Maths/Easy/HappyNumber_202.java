//https://leetcode.com/problems/happy-number/

public class HappyNumber_202 {
    public static void main(String[] args) {
        
    }

    public boolean isHappy(int n) {
        //For a cycle always use 2 pointers
        int slow = n , fast = n;

        do{
            slow = digitSum(slow);
            fast = digitSum(digitSum(fast));
        }while(slow != fast);

        //When slow and fast clash, check if it is on 1 or not
        if(slow == 1)
            return true;
        return false;
    }
    public int digitSum(int x){
        int ans = 0;
        while(x>0){
            int digit = x%10;
            ans += digit*digit;
            x /= 10;
        }
        return ans;
    }
}
