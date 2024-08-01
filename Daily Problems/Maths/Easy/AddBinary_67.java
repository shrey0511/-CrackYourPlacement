//https://leetcode.com/problems/add-binary/

public class AddBinary_67 {
    public static void main(String[] args) {
        
    }

    public String addBinary(String a, String b) {
        int carry = 0;
        int i = a.length()-1 , j = b.length()-1;

        StringBuilder sb = new StringBuilder();
        while(i>=0 || j>=0 || carry == 1){
            if(i >= 0){
                carry += a.charAt(i--) - '0';
            }
            if(j >= 0){
                carry += b.charAt(j--) - '0';
            }

            sb.append(carry%2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }
}
