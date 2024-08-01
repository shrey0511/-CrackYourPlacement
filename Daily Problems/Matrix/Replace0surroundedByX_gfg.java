//https://www.geeksforgeeks.org/problems/replace-os-with-xs0052/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

public class Replace0surroundedByX_gfg {
    public static void main(String[] args) {
        
    }

    static char[][] fill(int n, int m, char a[][]){
        
        //Replacing every O with -
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(a[i][j] == 'O'){
                    a[i][j] = '-';
                }
            }
        }
        
        //Traversing every edge to remove -
        for(int i = 0 ; i<n ; i++){
            //left
            if(a[i][0] == '-'){
                floodFill(a , i , 0 , '-' , 'O');
            }
            //right
            if(a[i][m-1] == '-')
                floodFill(a , i , m-1 , '-' , 'O');
        }
        
        for(int i = 0 ; i<m ; i++){
            //top
            if(a[0][i] == '-'){
                floodFill(a , 0 , i , '-' , 'O');
            }
            
            //bottom
            if(a[n-1][i] == '-')
                floodFill(a , n-1 , i , '-' , 'O');
        }
        
        //Replacing every - with X
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(a[i][j] == '-'){
                    a[i][j] = 'X';
                }
            }
        }
        return a;
    }
    
    public static int[] dirR = {1,-1,0,0};
    public static int[] dirC = {0,0,1,-1};
    static void floodFill(char[][] M , int n , int m , char prevS , char newS){
        
        if(n < 0 || m < 0 || n > M.length-1 || m > M[0].length-1)
            return;
        
        if(prevS != M[n][m]){
            return;
        }
        
        M[n][m] = newS;
        
        for(int i = 0 ; i<4 ; i++){
            int newR = n+dirR[i];
            int newC = m+dirC[i];
            
            floodFill(M , newR , newC , prevS , newS);
        }
        
        return;
        
    }
}
