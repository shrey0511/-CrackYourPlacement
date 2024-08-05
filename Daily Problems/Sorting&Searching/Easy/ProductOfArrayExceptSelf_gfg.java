//https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

public class ProductOfArrayExceptSelf_gfg {
    public static void main(String[] args) {
        
    }

    public static long[] productExceptSelf(int nums[]) {
        // code here
        if(nums.length == 1)
            return new long[]{1};
            
        int n = nums.length;
            
        long[] prod = new long[n];
        long[] left = new long[n];
        long[] right = new long[n];

        left[0] = 1;
        right[n-1] = 1;
        
        for(int i = 1 ; i<n ; i++){
            left[i] = left[i-1] * nums[i-1];
        }
        for(int j = n-2 ; j>=0 ; j--){
            right[j] = right[j+1] * nums[j+1];
        }
        
        for(int i = 0 ; i<n ; i++){
            prod[i] = left[i] * right[i];
        }
        
        return prod;
    }
}
