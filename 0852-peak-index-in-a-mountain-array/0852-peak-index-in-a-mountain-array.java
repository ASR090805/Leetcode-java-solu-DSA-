class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int lb=0,ub=arr.length-1,md;
        while(lb<ub){
            md=lb+(ub-lb)/2;
            if(arr[md]>arr[md+1]){
                ub=md;
            }
            else{
                lb=md+1;
            }
        }
        return lb;
    }
}