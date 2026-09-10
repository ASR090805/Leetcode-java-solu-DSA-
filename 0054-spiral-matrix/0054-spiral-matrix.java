class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        int i=0,j=-1;
        int n=matrix.length,
            m=matrix[0].length;
        int dir=1;
        while(m>0 && n>0){
            for(int k=0;k<m;k++){
                j+=dir;
                result.add(matrix[i][j]);
            }
            n--;
            for(int k=0;k<n;k++){
                i+=dir;
                result.add(matrix[i][j]);
            }
            m--;
            dir=dir*-1;
        }
        return result;
    }
}