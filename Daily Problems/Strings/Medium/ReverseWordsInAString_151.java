//https://leetcode.com/problems/reverse-words-in-a-string/

public class ReverseWordsInAString_151 {
    public static void main(String[] args) {
        
    }

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        //Below statement removes spaces from front and behind using trim
        //Space btw the words are removed using split \\s+
        String[] words = s.trim().split("\\s+");

        for(int i = words.length-1 ; i>=1 ; i--){
            sb.append(words[i] + " ");
        }
        
        return sb.append(words[0]).toString();
    }
}
