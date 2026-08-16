class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,k=0;
        for(i=0;i<nums.length;i++){
            if(k<2 || nums[i]!=nums[k-2])
            {
                nums[k++]=nums[i];
            }
        }
        return k;
    }
}