class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        if len(nums) == 1:
            return nums[0]
        M = [0 for _ in range(len(nums))]
        M[0] = nums[0]
        M[1] = max(nums[0], nums[1])
        for i in range(2, len(M)):
            M[i] = max(M[i-1], nums[i] + M[i-2])

        return M[-1]
