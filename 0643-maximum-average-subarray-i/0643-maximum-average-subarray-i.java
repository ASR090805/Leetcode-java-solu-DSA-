class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int sum=0,left=0,right=0;
        while(right<k){
            sum+=nums[right];
            right++;
        }
        max=Math.max(max,sum);
        while(right<nums.length){
            sum-=nums[left];
            sum+=nums[right];
            left++;
            right++;
            max=Math.max(sum,max);
        }
        return (double)max/k;
    }
}