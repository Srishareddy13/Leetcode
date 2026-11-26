class Solution(object):
    def maxArea(self, height):
        
        left=0
        right=len(height)-1
        maxarea=0

        while left<right:

            w=right-left
            h=min(height[left],height[right])
            area=w*h
            
            maxarea=max(maxarea,area)
            
            if height[left]<height[right]:
                left+=1
            else:
                right-=1
        return maxarea
