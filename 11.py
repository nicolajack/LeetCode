class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        i = 0
        j = len(height) - 1
        max = 0
        while i < j:
            curMax = (j - i) * min(height[i], height[j])
            if curMax > max:
                max = curMax
            else:
                if height[i] < height[j]:
                    i += 1
                else:
                    j -= 1
        return max    
