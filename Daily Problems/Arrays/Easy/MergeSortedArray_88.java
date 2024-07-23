//https://leetcode.com/problems/merge-sorted-array/

public class MergeSortedArray_88 {
    public static void main(String[] args) {
        
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1 , j = n-1 , k = m+n-1;

        while(j >= 0){//Untill the 2ndArray is alive
            if(i>=0 && nums1[i] > nums2[j]){
                nums1[k] = nums1[i--];
            }else{
                nums1[k] = nums2[j--];
            }
            k--;
        }

        return;
    }
}
