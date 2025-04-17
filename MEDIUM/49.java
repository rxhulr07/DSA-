class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String [] newArr = new String[strs.length];
        for(int i=0; i<strs.length; i++){
            char [] charArray = strs[i].toCharArray();
             Arrays.sort(charArray);
             newArr[i] = new String(charArray);
            }
         HashMap<String, List<String>> map = new HashMap<>();
          for(int i=0 ; i<strs.length; i++){
            String Sorted = newArr[i];
            if(!map.containsKey(Sorted)){
                map.put(Sorted ,new ArrayList<>());
            }
           map.get(Sorted).add(strs[i]);
          }

         return new ArrayList<>(map.values());
        
    }
}