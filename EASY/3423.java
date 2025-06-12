class Solution {
    public int maxAdjacentDistance(int[] nums) {

         int diff= Math.abs(nums[0]- nums[nums.length-1]);

        for(int i=0; i<nums.length-1; i++){
            int diff2 = Math.abs(nums[i]-nums[i+1]);
            diff = Math.max(diff,diff2);
  
        }
        return diff;
        
    }
}