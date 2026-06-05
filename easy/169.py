class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        ht = {}
        for i in nums:
            if i not in ht:
                ht[i] = 1
            else:
                ht[i] += 1
        max_key = max(ht, key=ht.get)
        return max_key
