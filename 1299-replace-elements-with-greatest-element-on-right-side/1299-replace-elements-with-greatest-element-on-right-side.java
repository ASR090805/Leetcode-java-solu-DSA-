class Solution {
    public int[] replaceElements(int[] arr) {
        int i=arr.length-1,max=-1;
        while(i>=0){
            if(arr[i]>max)
            {   int temp=arr[i];
                arr[i]=max;
                max=temp;
            }
            else{
                arr[i]=max;
            }
            i--;
        }
        return arr;
    }
}