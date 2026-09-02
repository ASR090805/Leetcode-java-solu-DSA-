class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        res.add( new ArrayList<Integer>());
        res.get(0).add(1);
        for(int row=1;row<numRows;row++){
            List<Integer> newrow=new ArrayList<>();
            newrow.add(1);
                List<Integer> prev=res.get(row-1);
            for(int i=1;i<row;i++){
                newrow.add(prev.get(i)+prev.get(i-1));
            }
            newrow.add(1);
            res.add(newrow);
        }
        return res;
    }
}