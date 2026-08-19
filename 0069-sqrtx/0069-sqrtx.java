class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        if(x==1|| x==2 || x==3) return 1;
        long ans=0,lb=0,ub=x,md;
        while(lb<=ub){
            md=lb+(ub-lb)/2;
            if(md*md>x){
                ub=md-1;
            }
            else{
                ans=md;
                lb=md+1;
            }
        }
        return (int)ans;
    }
}