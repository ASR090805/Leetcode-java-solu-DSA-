class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        int i=0,j=0;
        Set<Character> set=new HashSet<Character>();
        while(i<s.length()){
            char ch=s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(ch);
            maxlen=Math.max(maxlen,i-j+1);
            i++;
        }
        return maxlen;
    }
}