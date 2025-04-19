class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
     Arrays.sort(nums); 
    return countPairs(nums, upper) - countPairs(nums, lower - 1);
    }

    private long countPairs(int [] nums , int bound){
        int left =0;
        int right = nums.length-1;
        long count=0;

        while(left< right){
            if(nums[left] + nums[right]<=bound){
                count= count+(right -left);
                left++;
            }else{
                right--;
            }

        }
            return count;
    
}
}
