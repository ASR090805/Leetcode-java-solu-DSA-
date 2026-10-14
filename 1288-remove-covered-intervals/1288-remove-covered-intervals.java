class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{int val=Integer.compare(a[0],b[0]);
        return val==0? Integer.compare(b[1],a[1]):val;
        });
        int maxend=intervals[0][1],count=0;
        for(int i=1;i<intervals.length;i++){
            if(maxend<intervals[i][1]){
                maxend=intervals[i][1];
                count++;
            }
        }
        return count+1;
    }
}