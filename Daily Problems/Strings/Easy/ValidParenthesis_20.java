//https://leetcode.com/problems/valid-parentheses/

import java.util.Stack;

public class ValidParenthesis_20 {
    public static void main(String[] args) {
        
    }

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }else{
                if (st.isEmpty()) {
                    return false;
                }
                if(c == ')' && st.peek() == '('){
                    st.pop();
                }else if(c == '}' && st.peek() == '{'){
                    st.pop();
                }else if(c == ']' && st.peek() == '['){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
