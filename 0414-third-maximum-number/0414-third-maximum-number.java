class Solution {
    public int thirdMax(int[] nums) {
        long lar=Long.MIN_VALUE,sec=Long.MIN_VALUE,thir=Long.MIN_VALUE;
        int i=0;
        while(i<nums.length){
            if(nums[i]>lar){
                thir=sec;
                sec=lar;
                lar=nums[i];
            }
            else if(lar>nums[i] && nums[i]>sec){
                thir=sec;
                sec=nums[i];
            }
            else if(nums[i]<lar && nums[i]<sec && nums[i]>=thir){
                thir=nums[i];
            }
            i++;
        }
        return (thir==Long.MIN_VALUE)?(int)lar:(int)thir;
    }
}