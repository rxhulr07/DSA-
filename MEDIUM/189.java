
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = nums.length-k; i<nums.length; i++){
            list.add(nums[i]);
        }
        for(int i=0; i<nums.length-k; i++){
            list.add(nums[i]);
        }
       for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
       }
    }
}