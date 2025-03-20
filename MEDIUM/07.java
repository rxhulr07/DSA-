package MEDIUM;
class Solution {
    public int reverse(int x) {
        int rem =0;
        int reversed =0;
        boolean negative=false;
        if(x<0)
        {
            negative=true;
            x*=-1;
        }
        while(x>0){
          rem=x%10;
          x=x/10;
          if (reversed > Integer.MAX_VALUE / 10 || 
                (reversed == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
    
          reversed = reversed*10 + rem;

        }
        if(negative)return reversed*-1;
        return reversed;
        
    }
}