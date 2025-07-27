class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;
        int curMax;
        while (i <= j){
            curMax = (j - i) * Math.min(height[i], height[j]);
            if (curMax > max){
                max = curMax;
            } else {
                if (height[i] < height[j]){
                    i++;
                } else {
                    j--;
                }
            }
        }
        return max;
    }
}
