class Solution {
    public int countSubarrays(int[] nums) {
        if(nums.length<3) return 0;

        int count =0;
        for(int i=0; i<nums.length-2; i++){
            int j = i+2;

            if(nums[i] + nums[j] == nums[i+1]/2.0) count++;

        }
        return count;

    }
}