class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1)return nums[0];
        int lb=0,ub=nums.length-1,md;
        int min;
        while(lb<ub){
            md=(lb+ub)/2;
            if(nums[md]>nums[ub]){
                lb=md+1;
            }
            else if(nums[md]<nums[ub]){
                ub=md;
            }
            else{;
                break;
            }
        }
        return nums[lb];
    }
}