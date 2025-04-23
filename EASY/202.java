class Solution {
    public int sqrSum(int num){
      int sqr =0;
      while(num!=0){
     int rem = num%10;
     num/=10;
     sqr+= rem*rem;
      }
  
      return sqr; 
    }
  
      public boolean isHappy(int n) {
          Set<Integer> set = new HashSet<>();
         while(n!=1){
          n=sqrSum(n);
          if(!set.contains(n)){
              set.add(n);
          }else{
             return false;
          }
         }
          return true;
  }
  }