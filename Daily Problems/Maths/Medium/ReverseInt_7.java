//https://leetcode.com/problems/reverse-integer/

public class ReverseInt_7 {
    public static void main(String[] args) {
        
    }

    public int reverse(int x) {
        long ans = 0;

        boolean negative = false;
        if(x<0){
            negative = true; 
            x *= -1;
        }

        while(x>0){
            ans = ans*10 + x%10;
            x /= 10;
        }

        if(negative)
            ans *= -1;

        return  (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) ? 0 : (int)ans;
    }
}
