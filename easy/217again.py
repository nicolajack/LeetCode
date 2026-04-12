class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        list_hash = {}
        for i in nums:
            if i in list_hash:
                return True
            list_hash[i] = 1
        return False
