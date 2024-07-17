//https://leetcode.com/problems/container-with-most-water/

public class ContainerWithMostWater_11 {
    public static void main(String[] args) {
        
    }

    static int maxArea(int[] height) {
        int max = Integer.MIN_VALUE , left = 0 , right = height.length-1, currArea = 0;

        while(left < right){
            currArea = Math.min( height[left] , height[right] ) * ( right-left);

            max = Math.max(max , currArea);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
