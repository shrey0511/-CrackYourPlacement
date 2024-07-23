//https://leetcode.com/problems/game-of-life/

public class GameOfLife_289 {
    public static void main(String[] args) {
        
    }

    private int die = 2;
    private int live = 3;
    public void gameOfLife(int[][] board) {
        int m = board.length , n = board[0].length;
        // we only flip the 1 to die and 0 to live
        // so when we find a die around, it must be a previous 1
        // then we can count the 1s without being affected
        int lives = 0;
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                lives = countLives(board, i, j,m,n);
                if(board[i][j] == 0 && lives == 3){
                    board[i][j] = live;
                }else if(board[i][j] == 1 && lives < 2 || lives > 3){
                    board[i][j] = die;
                }
            }
        }

        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                if(board[i][j] == die)
                    board[i][j] = 0;
                else if(board[i][j] == 1)
                    board[i][j] = 1;
            }
        }
    }

    private int countLives(int[][] board , int i , int j ,int m , int n){
        int count = 0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1},{1,1},{-1,1},{1,-1},{-1,-1}};

        for(int[] dir : dirs){
            int x = i+dir[0];
            int y = j+dir[1];

            if(x>=0 && y>=0 && x<m && y<n){
                if(board[i][j] == 1 || board[i][j] == die)
                    count++;
            }
        }
        return count;
    }

}
