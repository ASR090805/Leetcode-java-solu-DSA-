class Solution {
    public int sum(int x){
        if(x<10) return x;
        int sum=0;
        while(x>0){
            int rem=x%10;
            sum=sum+rem;
            x/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int Nsum=sum(nums[i]);
            if(Nsum==i) return i;
        }
        return -1;
    }
}