class Solution {
    public int findMin(int[] nums) {
        int lb=0,ub=nums.length-1,md;
        while(lb<ub){
            md=(lb+ub)/2;
            if(nums[md]>nums[ub])
            {
                lb=md+1;
            }
            else if(nums[md]<nums[ub]){
                ub=md;
            }
            else{
                ub--;
            }
        }
        return nums[lb];
    }
}