class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals==null || intervals.length==0) return new int[][]{newInterval};
        int check=0;
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][1]>=newInterval[0] && intervals[i][0]<=newInterval[1]){
                check=1;
                intervals[i][0]=Math.min(intervals[i][0],newInterval[0]);
                intervals[i][1]=Math.max(intervals[i][1],newInterval[1]);
                break;
            }
        }
        List<int[]> res= new ArrayList<>();
        res.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=res.get(res.size()-1)[1])
            {
                res.get(res.size()-1)[0]=Math.min(intervals[i][0],res.get(res.size()-1)[0]);
                res.get(res.size()-1)[1]=Math.max(intervals[i][1],res.get(res.size()-1)[1]);
            }
            else{
                res.add(intervals[i]);
            }
        }
        if(check==0){
            res.add(newInterval);
            res.sort((a, b) -> Integer.compare(a[0], b[0]));
        }
        return res.toArray(new int[res.size()][]);
    }
}