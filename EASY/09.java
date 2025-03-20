package EASY;
class Solution {
    public boolean isPalindrome(int x) {
        int reversed=0;
        int original = x;

        while(x>0){
            int rem = x%10;
            x/=10;
            reversed = reversed*10+rem;
        }
        
        return reversed == original;
        
    } 
}