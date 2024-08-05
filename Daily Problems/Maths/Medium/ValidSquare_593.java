//https://leetcode.com/problems/valid-square/

import java.util.HashSet;

public class ValidSquare_593 {
    public static void main(String[] args) {
        
    }

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        HashSet<Integer> set = new HashSet<>();

        set.add(distanceSquares(p1,p2));
        set.add(distanceSquares(p1,p3));
        set.add(distanceSquares(p1,p4));
        set.add(distanceSquares(p2,p3));
        set.add(distanceSquares(p2,p4));
        set.add(distanceSquares(p3,p4));

        //In a square shape, no 0 distance should be there
        //Can only have 2 values , diagonals and sides
        return !set.contains(0) && set.size() == 2;
    }

    public int distanceSquares(int[] a , int[] b){
        return ((b[0] - a[0]) * (b[0] - a[0])) + ((b[1] - a[1]) * (b[1] - a[1]));
    }
}
