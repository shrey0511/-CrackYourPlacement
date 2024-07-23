//https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string/

import java.util.*;

public class PrintAllDuplicatesInString_GFG {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        findDup(s);
    }

    private static void findDup(String s) {
        HashMap<Character , Integer> map = new HashMap<>();    
        
        for(char c : s.toCharArray()){
            map.put(c , map.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + ", count = " + entry.getValue());
            }
        }

    }


}
