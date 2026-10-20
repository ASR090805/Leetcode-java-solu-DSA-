class Solution {
    public void sortColors(int[] nums) {
        /*int i=0,k=0,j=nums.length-1;
        while(k<=j){
            if(nums[k]==2){
                int temp=nums[k];
                nums[k]=nums[j];
                nums[j]=temp;
                j--;
            }
            else if(nums[k]==1){
                k++;
            }
            else{
                int temp=nums[k];
                nums[k]=nums[i];
                nums[i]=temp;
                i++;
                k++;
            }
        }*/
        for(int i=0;i<nums.length;i++){
            int min=Integer.MAX_VALUE,indx=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]<min){
                    min=nums[j];
                    indx=j;
                }
            }
            int temp=nums[i];
            nums[i]=nums[indx];
            nums[indx]=temp;

        }
    }
}