//https://leetcode.com/problems/number-of-islands/

public class NumberOfIslands_200 {
    public static void main(String[] args) {
        
    }

    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        
        int count = 0;

        for(int i = 0 ; i<grid.length ; i++){
            for(int j = 0 ; j<grid[0].length ; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    dfs(grid , visited , i , j);
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(char[][] grid , boolean[][] visited , int row , int col){

        int[] rowDir = {-1, 1, 0, 0};
        int[] colDir = {0, 0, -1, 1};

        visited[row][col] = true;

        for (int i = 0; i < 4; i++) {
            int newRow = row + rowDir[i];
            int newCol = col + colDir[i];
            if (isSafe(grid, visited, newRow, newCol)) {
                dfs(grid, visited, newRow, newCol);
            }
        }
    }

    private boolean isSafe(char[][] grid , boolean[][] visited , int row , int col){
        return (row<grid.length && row>=0 && col<grid[0].length 
        && col>=0 && grid[row][col] == '1' && !visited[row][col]);
    }
}
