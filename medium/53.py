class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        M = [0] * len(nums)
        M[0] = nums[0]
        for i in range(1, len(nums)):
            M[i] = max(nums[i], nums[i]+M[i-1])
        return max(M)
