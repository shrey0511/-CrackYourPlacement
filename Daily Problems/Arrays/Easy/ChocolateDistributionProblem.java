//https://www.geeksforgeeks.org/chocolate-distribution-problem/

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m = 7;
 
        int result = chocolateDistribution(arr, m);
 
        if (result != -1) {
            System.out.println("Minimum difference is " + result);
        } else {
            System.out.println("Invalid input");
        }
    }

    static int chocolateDistribution(int arr[], int m) {

        if(arr.length == 0 || m == 0)
            return 0;

        if(arr.length-1 < m)
            return -1;
        
        quickSort(arr, 0, arr.length-1);

        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i<arr.length ; i++){
            int nextWindow = i+m-1;

            if(nextWindow >= arr.length)
                break;

            if(arr[nextWindow] - arr[i] < min)
                min = arr[nextWindow] - arr[i];
        }
        return min;
    }

    static void quickSort(int[] arr , int start , int end){
        if(start >= end)
            return;

        int mid = (start + (end-start)) / 2;
        int pivot = arr[mid];

        int low = start , high = end;
        while(low <= high){
            while(arr[low] < pivot){
                low++;
            }
            while(arr[high] > pivot){
                high--;
            }
            if(low <= high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;high--;
            }

        }
        //Now pivot is in the sorted place
        quickSort(arr, start, high);
        quickSort(arr, low, end);

        return;
    }
}
