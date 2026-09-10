class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> newrow= new ArrayList<>();
        newrow.add(1);
        if(rowIndex==0) return newrow; 
        for(int row=1;row<=rowIndex;row++){
            List<Integer> prev=new ArrayList<>(newrow);
            newrow.clear();
            newrow.add(1);
            for(int i=1;i<row;i++){
                newrow.add(prev.get(i)+prev.get(i-1));
            }
            newrow.add(1);
        }
        return newrow;
    }
}