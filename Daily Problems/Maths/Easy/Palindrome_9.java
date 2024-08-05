//https://leetcode.com/problems/palindrome-number/

public class Palindrome_9 {
    public static void main(String[] args) {
        
    }

    public boolean isPalindrome(int x) {
        //We can try by reversing the entire num too but reversing only 
        //half is a better way

        if(x<0 || x != 0 && x%10 == 0)//Trailing zeroes
            return false;

        int reversed = 0;
        while(x > reversed){
            reversed = reversed*10 + x%10;
            x /= 10;
        }

        return (x == reversed) || (x == reversed/10);
    }
}
