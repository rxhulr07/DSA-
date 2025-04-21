class Solution {
    public boolean repeatedSubstringPattern(String s) {

       String s1 = s+s;
       int j= s1.length()-1;
        String sub = s1.substring(1,j);
        
    return sub.contains(s);
    }
}