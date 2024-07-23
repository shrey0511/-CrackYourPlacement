//https://leetcode.com/problems/generate-parentheses/

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis_22 {
    public static void main(String[] args) {
        
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans ,n , 0 , 0 , "");
        return ans;
    }
    private void helper(List<String> ans , int n , int countLeft , int countRight , String s){
        if(s.length() == n*2){
            ans.add(s);
            return; 
        }

        if(countLeft < n){
            helper(ans , n , countLeft+1 , countRight , s+"(");
        }
        if(countRight < countLeft){
            helper(ans , n , countLeft , countRight+1 , s+")");
        }

        return;
    }
}
