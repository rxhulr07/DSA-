class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] arr = new int[nums.length];
       int result=1;

       arr[0]=1;
       for(int i= 1; i<nums.length; i++){
        arr[i]= arr[i-1] *nums[i-1];
       }
        
        int suff = 1;
       for(int i= nums.length-1; i>=0; i--){
        arr[i]*= suff;
        suff *= nums[i];

       }
        

        return arr;
    }
}