class Solution {
    public int tribonacci(int n) {
        int[] M = new int[n+1];
        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else if (n == 2){
            return 1;
        }
        M[0] = 0;
        M[1] = 1;
        M[2] = 1;
        for (int i = 3; i <= n; i++){
            M[i] = M[i-1] + M[i-2] + M[i-3];
        }
        return M[n];
    }
}
