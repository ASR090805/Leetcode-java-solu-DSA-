class Solution {
    public int SquareSum(int x){
        int sum=0;
        while(x>0){
            int rem=x%10;
            sum+=rem*rem;
            x=x/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n,fast=n;
        do{
            slow=SquareSum(slow);
            fast=SquareSum(SquareSum(fast));
            if(fast==1) return true;
        }
        while(fast!=slow);
        return false;
    }
}