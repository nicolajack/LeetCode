class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] ans = new int[2];
        for (int i = 1; i < n; i++){
            if (!(Integer.toString(n-i).contains("0") || Integer.toString(i).contains("0"))){
                ans[0] = i;
                ans[1] = n-i;
                return ans;
            }
        }
        return ans;
    }
}
