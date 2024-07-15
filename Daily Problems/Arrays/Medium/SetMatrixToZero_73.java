class SetMatrixToZero_73{
    public static void main(String[] args) {
        
    }

    static void setZeroes(int[][] matrix) {
        boolean fr = false , fc = false;

        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[0].length ; j++){
                //Marking First row and First column acc. to the zeroes 
                //that we encounter in the matrix
                if(matrix[i][j] == 0){
                    if(i == 0) fr = true;
                    if(j == 0) fc = true;
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        //Now acc. to the first row & col we mark the rest
        for(int i = 1 ; i<matrix.length ; i++){
            for(int j = 1 ; j<matrix[0].length ; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }

        //Now for the first row and col
        if(fr){
            for(int i = 0 ; i<matrix.length ; i++){
                for(int j = 0 ; j<matrix[0].length ; j++){
                    matrix[0][j] = 0;
                }
            }
        }

        if(fc){
            for(int i = 0 ; i<matrix.length ; i++){
                for(int j = 0 ; j<matrix[0].length ; j++){
                    matrix[i][0] = 0;
                }
            }
        }
        return;
    }
}