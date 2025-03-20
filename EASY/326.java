package EASY;
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1) return false;
        long ab = (long)Math.pow(3,19);
        if(ab%n==0) return true;
    return false;
    }
    
}