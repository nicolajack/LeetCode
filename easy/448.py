class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        ans = []
        ht = {}
        # add to hash table
        for i in nums:
            ht[i] = 1
        # see if it's in ht, if not add to ans
        for i in range(1, len(nums) + 1):
            if i not in ht:
                ans.append(i)
        return ans

