class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] index={-1,-1};
        if(nums.length==0){
            return index;
        } 
        int lb=0,ub=nums.length-1,md;
        while(lb<=ub){
            md=lb+(ub-lb)/2;
            if(target==nums[md]){
                index[0]=md;
                ub=md-1;
            }
            else if(target>nums[md]){
                lb=md+1;
            }
            else if(target<nums[md]){
                ub=md-1;
            }
        }
        int lb1=0,ub1=nums.length-1;
        while(lb1<=ub1){
            md=lb1+(ub1-lb1)/2;
            if(target==nums[md]){
                index[1]=md;
                lb1=md+1;
            }
            else if(target>nums[md]){
                lb1=md+1;
            }
            else if(target<nums[md]){
                ub1=md-1;
            }
        }
        return index;
    }
}