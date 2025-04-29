class Solution {
    public boolean wordPattern(String pattern, String s) {

        Map<Character,String> mp = new HashMap<>();
        String arr [] = s.split(" ");
         if (arr.length != pattern.length()) {
            return false;
        }
        
        for(int i=0; i<pattern.length(); i++){
         char key = pattern.charAt(i);
         String value = arr[i];

            if(mp.containsKey(key)){
                if(!mp.get(key).equals(value)){
                    return false;   
                }
                }else{
                    if(mp.containsValue(value)){
                        return false;
                    }
                }
                    mp.put(key, value);
            }  
        return true;
        }
        
    }
