class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(s<0){
                s=0;
            }
            s+=nums[i];
            if(s>max){
                max=s;
            }
        }
        return max;
    }
}