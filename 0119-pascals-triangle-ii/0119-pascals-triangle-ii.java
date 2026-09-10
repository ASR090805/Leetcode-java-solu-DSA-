class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev= new ArrayList<>();
        prev.add(1);
        for(int row=1;row<=rowIndex;row++){
            List<Integer> newrow=new ArrayList<>();
            newrow.add(1);
            for(int i=1;i<row;i++){
                newrow.add(prev.get(i)+prev.get(i-1));
            }
            newrow.add(1);
            prev=newrow;
        }
        return prev;
    }
}