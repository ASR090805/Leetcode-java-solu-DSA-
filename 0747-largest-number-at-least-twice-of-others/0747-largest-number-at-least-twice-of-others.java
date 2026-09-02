class Solution {
    public int dominantIndex(int[] nums) {
        int largest=0;
        int seclar=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[largest]){
                seclar=nums[largest];
                largest=i;
            }
            else if(nums[i]<nums[largest] && nums[i]>seclar){
                seclar=nums[i];
            }
        }
        return nums[largest]>=seclar*2? largest:-1;
    }
}