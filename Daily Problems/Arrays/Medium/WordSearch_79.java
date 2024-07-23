//https://leetcode.com/problems/word-search/

public class WordSearch_79 {
    public static void main(String[] args) {
        
    }

    public boolean exist(char[][] board, String word){
        int m = board.length ,  n = board[0].length;
        boolean[][] check = new boolean[m][n];

        boolean result = false;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                result = backtrack(board , check , word , i , j , 0);
                if(result)
                    return true;
            }
        }
        return false;
    }

    private boolean backtrack(char[][] board , boolean[][] check , String word , int rows , int cols , int index){
        if(index == word.length())
            return true;

        if(rows < 0 || rows >= board.length || cols < 0 || cols >= board[0].length || check[rows][cols] || board[rows][cols] != word.charAt(index)){
            return false;
        }

        check[rows][cols] = true;

        if(
            backtrack(board , check , word , rows+1 , cols , index+1) ||
            backtrack(board , check , word , rows-1 , cols , index+1) ||
            backtrack(board , check , word , rows , cols+1 , index+1) ||
            backtrack(board , check , word , rows , cols-1 , index+1)  
        ){
            return true;
        }

        check[rows][cols] = false;

        return false;
    }
}
