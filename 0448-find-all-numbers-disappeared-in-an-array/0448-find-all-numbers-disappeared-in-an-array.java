class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=1;i<=nums.length;i++){
            set.add(i);
        }
        List<Integer> res=new ArrayList<>();
        for(int num:nums){
            if(set.contains(num)){
                set.remove(num);
            }
        }
        for(int num:set){
            res.add(num);
        }
        return res;
    }
}