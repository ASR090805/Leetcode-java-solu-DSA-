class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        List<int[]> res= new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            res.add(intervals[i]);
        }
        res.sort((a,b)-> a[0]==b[0]?b[1]-a[1]: a[0]-b[0]);
        for(int i=1;i<res.size();i++){
            if(res.get(i-1)[1]>=res.get(i)[1]){
                res.remove(res.get(i));
                i--;
            }
        }
        return res.size();
    }
}