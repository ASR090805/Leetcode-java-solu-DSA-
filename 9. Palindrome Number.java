class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x>=0 && x<=9) return true;
        int num=x;
        int result=0;
        while(x>0){
            int rem=x%10;
            result=result*10+rem;
            x/=10;
        }
        return (result==num)? true:false;
    }
}