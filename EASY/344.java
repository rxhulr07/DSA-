class Solution {
    public void reverseString(char[] s) {
        int j= s.length -1;
        int i=0;

        while(i<j){
            char swap = s[i];
            s[i]= s[j];
            s[j]= swap;
            i++;
            j--;
        }
       
        
    }
}