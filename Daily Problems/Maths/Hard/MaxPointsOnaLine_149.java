//https://leetcode.com/problems/max-points-on-a-line/

public class MaxPointsOnaLine_149 {
    public static void main(String[] args) {
        
    }

    public int maxPoints(int[][] points) {
        //slope : y = mx + c
        int n = points.length;//No. of points

        if(n <= 2)
            return n;//We will require those 2 to make a line

        int ans = 2;
        for(int i = 0 ; i<n ; i++){
            for(int j = i+1 ; j<n ; j++){
                int temp = 2;
                for(int k = j+1 ; k<n ; k++){
                    //Check slope of i,j against the third (k point)
                    int x = (points[j][1] - points[i][1]) * (points[k][0] - points[i][0]);
                    int y = (points[k][1] - points[i][1]) * (points[j][0] - points[i][0]);

                    if(x == y)//Slope same
                        temp++;
                }
                if(temp>ans)
                    ans = temp;
            }
        }
        return ans;
    }
}
