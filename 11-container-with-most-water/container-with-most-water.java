class Solution {
    public int maxArea(int[] height) {
       int left=0;
       int right=height.length-1;
       int maxarea=0;

       while(left<right){
        int wi=right-left;
        int h=Math.min(height[left],height[right]);
        int area=wi*h;
        if(area>maxarea){
            maxarea=area;
        }

        if(height[left]<height[right]){
            left++;
        }
        else{
            right--;
        }
       }
       return maxarea; 
    }
}