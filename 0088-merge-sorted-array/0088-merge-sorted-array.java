class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mainIndex=0,i=0,j=0;
        int[] arr= new int[nums1.length];
        while(i<(nums1.length-n) && j<nums2.length){
            if(nums1[i]<nums2[j]){
                arr[mainIndex++]=nums1[i++];
            }
            else if(nums1[i]==nums2[j]){
                arr[mainIndex++]=nums1[i++];
                arr[mainIndex++]=nums2[j++];
            }
            else{
                arr[mainIndex++]=nums2[j++];
            }
        }
        while(i<(nums1.length-n))
        {
            arr[mainIndex++]=nums1[i++];
        }
        while(j<(nums2.length))
        {
            arr[mainIndex++]=nums2[j++];
        }
        for(i=0;i<nums1.length;i++){
            nums1[i]=arr[i];
        }
    }
}