class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        t = s.lower().strip()
        i = 0
        j = len(t) - 1
        while i < j:
            if not t[i].isalnum():
                i += 1
            elif not t[j].isalnum():
                j -= 1
            else:
                if t[i] != t[j]:
                    return False
                i += 1
                j -= 1
        return True
