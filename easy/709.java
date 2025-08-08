class Solution(object):
    def toLowerCase(self, s):
        """
        :type s: str
        :rtype: str
        """
        ans = ""
        for i in range(len(s)):
            ascii = ord(s[i])
            if 65 <= ascii <= 90:
                ans += chr(ascii + 32)
            else:
                ans += chr(ascii)
        return ans
