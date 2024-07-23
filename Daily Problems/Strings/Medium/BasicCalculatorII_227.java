//https://leetcode.com/problems/basic-calculator-ii/

public class BasicCalculatorII_227 {
    public static void main(String[] args) {
        
    }

    public int calculate(String s) {
        int sum = 0 , last = 0 , num = 0;
        char op = '+';

        for(int i = 0 ; i<s.length() ; i++){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                num = (num*10) + (c-'0');
            }
            if(isOperator(c) || i == s.length()-1){
                if(op == '+'){
                    sum += last;
                    last = num;
                }else if(op == '-'){
                    sum += last;
                    last = -num;
                }else if(op == '*'){
                    last *= num;
                }else if(op == '/'){
                    last /= num;
                }

                num = 0;    op = c;
            }
        }
        return sum += last;
    }

    private boolean isOperator(char x){
        return x == '+' || x == '-' || x == '*' || x == '/' ; 
    }
}
