//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

public class IndexOfFirstOccurenceInString_28 {
    public static void main(String[] args) {
        
    }

    public int strStr(String haystack, String needle) {
        
        for(int i = 0 ; i <= haystack.length() - needle.length() ; i++){
            if(haystack.substring(i , i + needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;

    }
}
