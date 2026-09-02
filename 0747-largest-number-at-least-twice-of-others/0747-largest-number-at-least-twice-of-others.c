int dominantIndex(int* nums, int numsSize) {
    int maxval=nums[0], maxindex,secmax=INT_MIN;
    for(int i=1;i<numsSize;i++){
        if(maxval<nums[i]){
            secmax=maxval;
            maxval=nums[i];
            maxindex=i;
        }
        else if(maxval>nums[i] && secmax<nums[i])
        {
            secmax=nums[i];
        }
    }
    if((secmax*2)<= maxval) return maxindex;
    else return -1;
}