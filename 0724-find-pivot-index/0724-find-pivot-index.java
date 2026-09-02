class Solution {
    public int sum(int i,int j,int[] nums){
        int sum=0;
        while(i<=j){
            sum+=nums[i];
            i++;
        }
        return sum;
    }
    public int pivotIndex(int[] nums) {
        int pivot=0;
        while(pivot<nums.length){
            int leftSum=sum(0,pivot-1,nums);
            int rightSum=sum(pivot+1,nums.length-1,nums);
            if(leftSum!=rightSum){
                pivot++;
            }
            else{
                return pivot;
            }
        }
        return -1;
    }
}