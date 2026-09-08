class Solution {
    public void rotate(int[] nums, int k) {
        int start,count=0;
        for(start=0;count<nums.length;start++){
            int preval=nums[start];
            int nextIndx=start;
            do{
                nextIndx=(nextIndx+k)%nums.length;
                int temp=nums[nextIndx];
                nums[nextIndx]=preval;
                preval=temp;
                count++;
            }
            while(start!=nextIndx);
        }
    }
}