class Solution {
    public int lengthOfLongestSubstring(String s) {
    
    HashMap <Character,Integer> map = new HashMap<>();
    int max =0;
     int j=0;
    for(int i=0; i<s.length(); i++){
      if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))>=j)
      {
        j=map.get(s.charAt(i))+1;
      }
        map.put(s.charAt(i),i);
        max=Math.max((i-j)+1, max);

    }
        return max;
}
}