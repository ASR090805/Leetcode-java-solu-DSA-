class Solution {
    public void reverse(char[] arr,int st,int e){
        while(st<e){
            char temp=arr[st];
            arr[st]=arr[e];
            arr[e]=temp;
            st++;
            e--;
        }
    }
    public String reverseWords(String s) {
        char[] arr= s.toCharArray();
        int st=0,e=0;
        while(st<arr.length){
            while(e<arr.length && arr[e]!=' ')
            {
                e++;
            }
            //swap
            reverse(arr,st,e-1);
            st=e+1;
            e++;
        }
        return new String(arr);
    }
}