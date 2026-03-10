//brute force approach

//class Solution {
//  public void merge(int[] nums1, int m, int[] nums2, int n) {
//     for(int i = 0; i<n ;i++){
//          nums1[m+i] = nums2[i];
//     }
//      Arrays.sort(nums1);
//  }
//}

//optimal approach
public class mergesortedarrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        
        while(j>= 0){
            if(i >= 0 && nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }
    }
}

//as both nums1 and nums2 are sorted we can start from the end of both arrays and compare
// the elements and place the larger one at the end of nums1.This way we can avoid using 
// extra space and also we don't need to sort the array again. so larger element will be placed 
// at the end of nums1 and we can move the pointers accordingly.