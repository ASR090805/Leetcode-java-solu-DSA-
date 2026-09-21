class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map= new HashMap<Integer,Integer>();  
        int res=0,min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
            else{
                res=Math.abs(map.get(nums[i])-i);
                if(res>k){
                    map.remove(nums[i]);
                    map.put(nums[i],i);
                }
                else{
                    min=Math.min(res,min);
                }
            }
            
        }  
        if(min==Integer.MAX_VALUE) return false;
        return min<=k?true:false;
    }
}