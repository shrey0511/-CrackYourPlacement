import java.util.Arrays;

public class CheckIfReversingSubArrayMakesArraySorted_gfg {
    public static void main(String[] args) {
        
    }

    public boolean checkReverse(int arr[], int n) {
        int[] temp = new int[arr.length];

        for(int i = 0 ; i<temp.length ; i++){
            temp[i] = arr[i];
        }

        Arrays.sort(temp);

        int front , back ;

        for(front = 0 ; front<n ; front++){
            if(arr[front] != temp[front])
                break;
        }

        for(back = n-1 ; back>=0 ; back--){
            if(arr[back] != temp[back])
                break;
        }

        if(front >= back) return true;

        //Checking if subarray is decresing or not
        do {
            front++;
            if(arr[front] < arr[front+1])
                return false;
        } while (front <= back);

        return true;
    } 
}
