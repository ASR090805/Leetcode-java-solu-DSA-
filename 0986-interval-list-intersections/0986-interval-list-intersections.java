class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int[][] res= new int[1000][0];
        List<int[]> list=new ArrayList<int[]>();
        int i=0,j=0;
        while(i<firstList.length && j<secondList.length){
            int[] x=firstList[i];
            int[] y=secondList[j];
            int lo=Math.max(x[0],y[0]);
            int hi=Math.min(x[1],y[1]);
            if(lo<=hi){
                list.add(new int[]{lo,hi});
            }
            if(x[1]<y[1]) i++;
            else j++;
        }
        return list.toArray(new int[list.size()][]);
    }
}