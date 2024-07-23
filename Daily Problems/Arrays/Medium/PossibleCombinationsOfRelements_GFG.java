//https://www.geeksforgeeks.org/print-all-possible-combinations-of-r-elements-in-a-given-array-of-size-n/

import java.util.Arrays;

public class PossibleCombinationsOfRelements_GFG {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 1};
        int r = 3;
        int n = arr.length;
        printCombinations(arr, r);
    }

    public static void printArray(int[] data , int r){
        for(int i = 0 ; i<r ; i++){
            System.out.println(data[i] + " ");
        }
        System.out.println();
    }

    public static void printCombinations(int[] arr , int r){
        int[] data = new int[arr.length];

        //To handle duplicates
        Arrays.sort(arr);

        combinationsUtil(arr, arr.length, data, r , 0 , 0);
    }

    public static void combinationsUtil(int[] arr , int n , int[] data , int r , int index , int i){
        if(index == r){
            printArray(data, r);
            return;
        }

        if(i >= n)
            return;

        data[index] = arr[i];
        combinationsUtil(arr, n, data, r, index+1, i+1);

        while(i < n-1 && arr[i] == arr[i+1])
            i++;

        //Current element not considered
        combinationsUtil(arr, n, data, r, index, i+1);
    }
}
