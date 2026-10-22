class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        /*Arrays.sort(nums);
        List<Integer> res= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                res.add(i);
            }
        }*/
        List<Integer> res= new ArrayList<>();
        int ele=0,count=0;
        for(int el:nums){
            if(el<target){
                ele++;
            }
            if(el==target){
                count++;
            }
        }
        while((count)>0){
            res.add(ele);
            ele++;
            count--;
        }

        return res;
    }
}