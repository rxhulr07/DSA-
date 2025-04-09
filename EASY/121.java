class Solution {
    public int maxProfit(int[] prices) {
      int minP =Integer.MAX_VALUE;
      int maxP =0;

      for(int i=0; i<prices.length; i++){
        if(minP > prices[i]){
            minP = prices[i];
        }else{
            int profit = (prices[i] - minP);
            if(profit > maxP){
                maxP = profit;
            }
        }
      
      }
        return maxP;
    }
}