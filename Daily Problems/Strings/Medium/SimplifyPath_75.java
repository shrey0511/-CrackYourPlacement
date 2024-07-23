//https://leetcode.com/problems/simplify-path/

import java.util.Stack;

public class SimplifyPath_75 {
    public static void main(String[] args) {
        
    }

    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] files = path.split("/");

        for(int i = 0 ; i<files.length ; i++){
            String word = files[i];
            if(word.length() == 0 || word.equals("."))
                continue;
            else if(word.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(word);    
            }
        }
        
        StringBuilder s = new StringBuilder();
        for(String dir : st){
            s.append('/').append(dir);
        }

        return s.length() == 0 ? "/" : s.toString();
    }
}
