class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        int count=0;
        while((n&1)==0)
        {
            n=n>>1;
            count++;
        }
        return n==1 && count%2==0;
    }
}