class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> mp = new HashSet<>();

       for(int num : nums){
        if (!mp.add(num)) {
             return true;
        }
       }

     return false;
        
    }
}