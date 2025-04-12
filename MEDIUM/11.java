class Solution {
    public int maxArea(int[] height) {
        int maxCap=0;
        int j=height.length-1;
        int i=0;
        while(i<j){
        int dis =Math.abs(j-i);
        int area = Math.min(height[i], height[j]) * dis;
           maxCap= Math.max(maxCap, area);
           if(height[i]<height[j]){
             i++;
           }
          else {
           j--;
           }
        }
        
        return maxCap;
    }
}