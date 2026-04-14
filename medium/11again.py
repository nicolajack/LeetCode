class Solution:
    def maxArea(self, height: List[int]) -> int:
        l = 0
        r = len(height) - 1
        maxArea = 0
        while l < r:
            h = min(height[l], height[r])
            width = r - l
            if h * width > maxArea:
                maxArea = h * width
                if height[l] < height[r]:
                    l += 1
                else:
                    r -= 1
            elif height[l] < height[r]:
                l += 1
            else:
                r -= 1
        return maxArea
