class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        longest = 0
        curLongest = 0
        for i in range(len(s)):
            map = {}
            j = i
            while j < len(s):
                if map.get(s[j]) != None:
                    break
                map[s[j]] = j
                curLongest += 1
                j += 1
            if curLongest > longest:
                longest = curLongest
            
            curLongest = 0
        return longest
