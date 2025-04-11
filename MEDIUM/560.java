class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> sum = new HashMap<>();
        sum.put(0,1);
        int tSum =0;
        int count =0;
        for( int num : nums){
            tSum+=num;
            if(sum.containsKey(tSum-k)){
               count+= sum.get(tSum-k);
            }
                 sum.put(tSum, sum.getOrDefault(tSum, 0) + 1);
                
        }
        return count;
    }
}