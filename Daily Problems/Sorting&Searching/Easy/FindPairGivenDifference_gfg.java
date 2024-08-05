//https://www.geeksforgeeks.org/problems/find-pair-given-difference1559/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

import java.util.HashMap;

public class FindPairGivenDifference_gfg {
    public static void main(String[] args) {
        
    }

    public int findPair(int n, int x, int[] arr) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int elem : arr){
            map.put(elem , map.getOrDefault(elem,0)+1);
        
            if(x == 0 && map.get(elem)>1){
                return 1;
            }
        }
        
        if(x == 0) return -1;
        
        for(int i = 0 ; i<arr.length ; i++){
            if(map.containsKey(Math.abs(arr[i] + x))){
                return 1;
            }
        }
        return -1;
    }
}
