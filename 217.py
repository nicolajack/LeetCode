class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        hs = set()
        for i in range(len(nums)):
            hs.add(nums[i])
        if len(hs) < len(nums):
            return True
        else:
            return False
