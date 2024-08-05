//https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

public class FloorInSortedArray_gfg {
    public static void main(String[] args) {
        
    }

    static int findFloor(long arr[], int n, long x) {
        
        int low = 0 , high = n-1;
        
        if(arr[low] > x)
            return -1;
            
        if(arr[high] <= x)
            return high;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == x){
                return mid;    
            }else if(arr[mid] < x){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return high;
    }
}
