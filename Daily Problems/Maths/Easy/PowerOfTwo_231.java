//https://leetcode.com/problems/power-of-two/

public class PowerOfTwo_231 {
    public static void main(String[] args) {
        
    }

    public boolean isPowerOfTwo(int n) {
        //All nos. with power 2 consist of one 1 like 4 = 100
        //nos. less than power of 2 ,consist of all 1 except that place,3 = 011
        return n>0 && (n & (n-1)) == 0;
    }

    public boolean isPowerOfTwoRec(int n){
        if(n == 1)
            return true;
        if(n < 1 || n % 2 != 0)
            return false;
        
        return isPowerOfTwo(n/2);
    }
}
