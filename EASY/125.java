class Solution {
    public boolean isPalindrome(String s) {
  
     String clean = s.replaceAll("[^0-9a-zA-Z]","");
      clean = clean.toUpperCase();
     char[] arr = clean.toCharArray();
     int i=0;
     int j = arr.length -1;
         
      while(i<j){
        if(arr[i]!= arr[j]){
           return false;
        }else{
            j--;
            i++;
        }
      }
      return true;
 
    }
}