//https://leetcode.com/problems/group-anagrams/

import java.util.*;

public class GroupAnagrams_49 {
    public static void main(String[] args) {
        
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();

        for(String word : strs){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sortedWord = new String(ch);

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord , new ArrayList<String>());
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
