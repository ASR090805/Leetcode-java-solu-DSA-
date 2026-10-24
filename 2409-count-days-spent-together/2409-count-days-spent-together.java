class Solution {
    public int[] days={31,28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int days(String s){
        int tday=0,i=0;
        while(i<Integer.parseInt(s.substring(0,2))-1){
            tday+=days[i];
            i++;
        }
        int d=Integer.parseInt(s.substring(3));
        return tday+d;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aa=days(arriveAlice);
        int al=days(leaveAlice);
        int ab=days(arriveBob);
        int bl=days(leaveBob);
        int res=Math.min(al,bl)-Math.max(aa,ab)+1;
        return res<0?0:res;

    } 
}