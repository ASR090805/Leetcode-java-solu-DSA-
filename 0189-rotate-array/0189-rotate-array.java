class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int pos=(k+i)%nums.length;
            temp[pos]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
    }
}