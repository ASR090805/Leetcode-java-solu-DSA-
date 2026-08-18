class Solution {
    public int search(int[] nums, int target) {
        int lb=0,ub=nums.length-1,md;
        while(lb<ub){
            md=(ub+lb)/2;
            if(nums[md]>nums[ub])
            {
                lb=md+1;
            }
            else{
                ub=md;
            }
        }
        int min=lb;
        int lb1=0,ub1=nums.length-1;

        if(target>=nums[lb1]){
            if(min!=0){
            ub1=min-1;
            }
        }
        else{
            lb1=min;
        }
        while(lb1<=ub1){
            md=(ub1+lb1)/2;
            if(target<nums[md])
            {
                ub1=md-1;
            }
            else if(target>nums[md]){
                lb1=md+1;
            }
            else{
                return md;
            }
        }
        return -1;
    }
}