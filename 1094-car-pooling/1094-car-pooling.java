class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
       int[] buckets=new int[1001];
       for(int[] trip:trips){
            int pass=trip[0];
            int srt=trip[1];
            int end=trip[2];
            buckets[srt]+=pass;
            buckets[end]-=pass;
       }
       int passenger=0;
       for(int buck:buckets){
            passenger+=buck;
            if(passenger>capacity){
                return false;
            }
       }
        return true;
    }
}