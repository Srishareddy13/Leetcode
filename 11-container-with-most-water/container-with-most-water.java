class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxarea=0;
        int res=0;
        int m,s;
        while(left<right){
            s=right-left;
            m=Math.min(height[left],height[right]);
            res=s*m;
            if(res>maxarea){
                maxarea=res;
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