//https://leetcode.com/problems/spiral-matrix/

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_54 {
    public static void main(String[] args) {
        
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int left = 0 , right = matrix[0].length-1 , top = 0 , bottom = matrix.length-1;
        while(left <= right && top <= bottom){
            //For the first row
            for(int i = left ; i<=right ; i++){
                ans.add(matrix[top][i]);
            }
            top++;

            //Now the last column
            for(int i = top ; i<=bottom ; i++){
                ans.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){
                for(int i = right ; i>=left ; i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){
                for(int i = bottom ; i>=top ; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
