class Solution {

    public int twodigits(int num){
       int sum=0;
       while (num>0)
       {
       int rem = num%10;
       sum += rem;
        num/=10;
   }
   return sum;
       
    }
   public int addDigits(int num) {
   if(num <10) return num;
   while(num >= 10){
       num = twodigits(num);
   }
   return num;

   }
}