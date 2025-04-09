class Solution {
    public boolean isPerfectSquare(int num) {
        boolean bool = false;
        if(num ==0  || num ==1) return true;
            
        int start=0;
        int end = num;

        while(start<=end){
        int mid = start + (end - start) / 2;
         long square = (long) mid * mid;
        if(square == num) return true;
        else if(square > num){
            end = mid -1;
        }else{
            start = mid +1;
        }
        }
        return false;
    }
}