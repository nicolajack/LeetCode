class Solution {
    public int climbStairs(int n) {
        int[] M = new int[n+1];
        if (n == 1){
            return 1;
        }
        M[0] = 0;
        M[1] = 1;
        M[2] = 2;
        for (int i = 3; i <= n; i++){
            M[i] = M[i-1] + M[i-2];
        }
        return M[n];
    }
}
