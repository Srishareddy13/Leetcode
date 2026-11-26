class Solution(object):
    def twoSum(self, nums, target):
        map={}

        for i in range(len(nums)):

            result=target-nums[i]

            if result in map:
                return (map[result],i)
            
            map[nums[i]]=i