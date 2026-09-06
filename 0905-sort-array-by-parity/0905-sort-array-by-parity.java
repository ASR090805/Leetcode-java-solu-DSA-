class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int indx=0, i=0;
        while(i<nums.length){
            if(nums[i]%2==0){
                int temp=nums[i];
                nums[i]=nums[indx];
                nums[indx]=temp;
                indx++;
            }
            i++;
        }
        return nums;
    }
}