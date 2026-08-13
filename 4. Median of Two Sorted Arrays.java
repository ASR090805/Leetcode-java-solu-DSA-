class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums=new int[nums1.length+nums2.length];
        int k=0,i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                nums[k]=nums1[i];
                i++;
            }
            else{
                nums[k]=nums2[j];
                j++;
            }
            k++;
        }
        if(i!=nums1.length){
            while(i<nums1.length){
                nums[k++]=nums1[i];
                i++;
            }
        }
        if(j!=nums2.length){
            while(j<nums2.length){
                nums[k++]=nums2[j];
                j++;
            }
        }
        return median(nums);
    }
    public double median(int[] nums){
        if(nums.length==1) return nums[0];
        if(nums.length%2!=0){
            int mid=nums.length/2;
            return nums[mid];
        }
        else{
            int mid1=nums.length/2-1;
            int mid2=nums.length/2;
            return (nums[mid1]+nums[mid2])/2.0;
        }
    }
}