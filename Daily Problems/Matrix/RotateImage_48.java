//https://leetcode.com/problems/rotate-image/

public class RotateImage_48 {
    public static void main(String[] args) {
        
    }

    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverseRows(matrix);
    }
    private void transpose(int[][] matrix){
        for(int i = 0 ; i<matrix.length ; i++){
            //Applying swap across main diagonal
            for(int j = i ; j<matrix[0].length ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    private void reverseRows(int[][] matrix){
        for(int i = 0 ; i<matrix.length ; i++){
            int left = 0 , right = matrix.length-1;
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }
}
