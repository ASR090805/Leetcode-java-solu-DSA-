class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Map<Integer,Integer> map= new TreeMap<>();
        for(int[] trip:trips){
            int pass=trip[0];
            int strt=trip[1];
            int end=trip[2];

            map.put(strt,map.getOrDefault(strt,0)+pass);
            map.put(end,map.getOrDefault(end,0)-pass);
        }
        int passenger=0;
        for(Map.Entry<Integer,Integer> ent:map.entrySet()){
            passenger+=ent.getValue();
            if(passenger>capacity){
                return false;
            }
        }
        return true;
    }
}