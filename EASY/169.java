import java.util.Hashtable;

class Solution {
    public int majorityElement(int[] arr) {

       Hashtable<Integer, Integer> hash = new Hashtable<>();
        for(int num : arr){
            if(hash.containsKey(num)){
                hash.put(num, hash.get(num)+1);
            }else{
                hash.put(num,1);
            }
        }
         int maxValue= -1;
        for(int value : hash.values()){
            if(value> maxValue) maxValue = value;
        }

        int resultKey = Integer.MIN_VALUE;
        for (int key : hash.keySet()) {
            if (hash.get(key) == maxValue && key > resultKey) {
                resultKey = key;
            }
        }

     return resultKey;
    }
}