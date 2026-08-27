class Solution {
    public int appendCharacters(String s, String t) {
        int i=0,j=0,len=t.length();
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i=i+1;
                j=j+1;
            }
            else if(s.charAt(i)!=t.charAt(j)){
                i=i+1;
            }
        }
        return len-j;
    }
}