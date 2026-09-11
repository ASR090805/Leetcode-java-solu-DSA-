class Solution {
    public int[][] generateMatrix(int n) {
        int k=1;
        int i=0,j=-1;
        int m=n;
        int[][] result=new int[n][m];
        int dir=1;
        while(n>0 && m>0){
            for(int x=0;x<m;x++){
                j+=dir;
                result[i][j]=k;
                k++;
            }
            n--;
            for(int x=0;x<n;x++){
                i+=dir;
                result[i][j]=k;
                k++;
            }
            m--;
            dir*=-1;
        }
        return result;
    }
}