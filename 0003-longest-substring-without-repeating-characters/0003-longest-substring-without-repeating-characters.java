class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        int i=0;
        while(i<s.length()){
            Set<Character> set=new HashSet<Character>();
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(set.contains(ch)){
                    break;
                }
                set.add(ch);
                maxlen=Math.max(maxlen,j-i+1);
            }
            i++;
        }
        return maxlen;
    }
}