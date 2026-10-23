class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int min=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            min=Math.min((arr[i]-arr[i-1]),min);
        }
        List<List<Integer>> res= new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(min==arr[i]-arr[i-1]){
                res.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }

        return res;
    }
}