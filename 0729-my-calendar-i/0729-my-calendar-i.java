class MyCalendar {
    List<int[]> bookings;

    public MyCalendar() {
        bookings= new ArrayList<>();    
    }
    public boolean overlap(int[] i1,int s2,int e2){
        return i1[1]>=s2 && e2>=i1[0];
    }
    public boolean book(int startTime, int endTime) {
        if(bookings.size()==0){
            bookings.add(new int[]{startTime,endTime-1});
            return true;
        }
        for(int i=0;i<bookings.size();i++){
            if(overlap(bookings.get(i),startTime,endTime-1)){
                return false;
            }
        }
        bookings.add(new int[]{startTime,endTime-1});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */