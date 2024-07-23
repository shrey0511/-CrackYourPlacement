//https://leetcode.com/problems/longest-common-prefix/

import java.util.Arrays;

public class LongestCommonPrefix_14 {
    public static void main(String[] args) {
        
    }

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        StringBuilder sb = new StringBuilder();

        String first = strs[0];
        String last = strs[strs.length-1];

        for(int i = 0 ; i < Math.min(first.length(),last.length()) ; i++){
            if(first.charAt(i) != last.charAt(i)){
                return sb.toString();
            }else{
                sb.append(first.charAt(i));
            }
        }
        return sb.toString();
    }
}
