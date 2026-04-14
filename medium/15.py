class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        sol = []
        nums.sort()
        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            l = i + 1
            r = len(nums) - 1
            while l < r and l != i and r != i:
                if -nums[i] == nums[l] + nums[r]:
                    sol.append([nums[i], nums[l], nums[r]])
                    l += 1
                    r -= 1
                    while l < r and nums[l] == nums[l-1]:
                        l += 1
                elif -nums[i] < nums[l] + nums[r]:
                    r -= 1
                else:
                    l+= 1
        return sol
