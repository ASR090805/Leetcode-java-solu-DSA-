class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=0,sum=0;
        int left=0,right=0;
        while(right<k){
            sum+=nums[right];
            right++;
        }
        max=sum;
        while(right<nums.length){
            sum-=nums[left];
            sum+=nums[right];
            left++;
            right++;
            if(sum>max){
                max=sum;
            }
        }
        return max/k;
    }
}