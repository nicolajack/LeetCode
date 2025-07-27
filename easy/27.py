class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        l = 0
        r = len(nums) - 1
        k = len(nums)
        while l <= r:
            if nums[l] == val:
                nums[l] = nums[r]
                r -= 1
                k -= 1
            else:
                l += 1
        return k
