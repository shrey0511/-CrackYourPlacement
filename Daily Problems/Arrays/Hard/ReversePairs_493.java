//https://leetcode.com/problems/reverse-pairs/

public class ReversePairs_493 {
    public static void main(String[] args) {
        
    }

    private int count = 0;
    public int reversePairs(int[] nums) {
        if(nums.length == 1) return 0;
        mergeSort(nums , 0 , nums.length-1);
        return count;
    }

    private int[] mergeSort(int[] arr , int start , int end){
        if(start >= end)
            return new int[]{arr[start]};

        int mid = start + (end-start) / 2;

        int[] left = mergeSort(arr, start, mid);
        int[] right = mergeSort(arr, mid+1, end);

        //Count
        int i = 0 , j = 0;
        for( ; i<left.length ; i++){
            while(j<right.length && left[i]/2.0 > right[j])
                j++;
            count += j;
        }

        //Now just merge
        int[] merged = new int[end-start+1];
        i = 0 ;
        j = 0;
        int k = 0;

        while(i < left.length || j < right.length){
            if(i < left.length && j<right.length){
                merged[k] = (left[i]<right[j])? left[i++] : right[j++];
            }else if(i < left.length){
                merged[k] = left[i++];
            }else{
                merged[k] = right[j++];
            }
            k++;
        }

        return merged;
    }

}
