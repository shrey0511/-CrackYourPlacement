//https://leetcode.com/problems/valid-palindrome-ii/

public class ValidPalindromeII_680 {
    public static void main(String[] args) {
        
    }

    public boolean validPalindrome(String s) {
        int start = 0 , end = s.length()-1;
        while(start < end){
            if(s.charAt(start) == s.charAt(end)){
                start++;end--;
            }else{
                return validPalindrome(s , start+1 , end) || validPalindrome(s , start , end-1);
            }
        }
        return true;
    }
    private boolean validPalindrome(String s , int start , int end){
        while(start<end){
            if(s.charAt(start) == s.charAt(end)){
                start++;end--;
            }else{
                return false;
            }
        }
        return true;
    }
}
