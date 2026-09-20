class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max=0,sum=0;
        int dups=0;
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<k;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],0);
            }
            map.put(nums[i],map.get(nums[i])+1);
            sum+=nums[i];
            if(map.get(nums[i])>1){
                dups+=1;
            }
        }
        if(dups==0){
            max=Math.max(sum,max);
        }
        for(int i=k;i<nums.length;i++){
            int num1=nums[i],
                num2=nums[i-k];
            if(!map.containsKey(num1)){
                map.put(num1,0);
            }
            map.put(num1,map.get(num1)+1);
            if(map.get(num1)>1){
                dups+=1;
            }
            sum+=num1;
            if(map.get(num2)>1){
                dups-=1;
            }
            map.put(num2,map.get(num2)-1);
            sum-=num2;
            if(dups==0){
                max=Math.max(sum,max);
            }
        }
        
        return max;
    }
}