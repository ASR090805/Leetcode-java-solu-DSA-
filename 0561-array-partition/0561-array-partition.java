class Solution {
    public int arrayPairSum(int[] nums) {
        int k=10000;
        int[] arr=new int[2*k+1];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]+k]++;
        }

        int maxsum=0;
        boolean isEven=true;
        for(int i=0;i<2*k+1;i++){
            while(arr[i]>0){
                maxsum=maxsum+(isEven?i-k:0);
                arr[i]--;
                isEven=!isEven;
            }
        }
        return maxsum;
    }
}