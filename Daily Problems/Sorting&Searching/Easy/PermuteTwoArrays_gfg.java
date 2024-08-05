//https://www.geeksforgeeks.org/permute-two-arrays-sum-every-pair-greater-equal-k/

import java.util.Arrays;

public class PermuteTwoArrays_gfg {
    public static void main(String[] args) {
        
    }

    public boolean isPossible(int k, int[] arr1, int[] arr2) {
        // Your code goes here.
        Arrays.sort(arr1);
        // Sort arr2 in descending order
        Arrays.sort(arr2);
        for (int i = 0, j = arr2.length - 1; i < arr1.length; i++, j--) {
            if (arr1[i] + arr2[j] < k) {
                return false;
            }
        }
        return true;
    }
}
