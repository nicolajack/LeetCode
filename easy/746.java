class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] M = new int[cost.length];
        for (int i = 0; i < cost.length; i++){
            if (i <2){
                M[i] = cost[i];
            } else {
                M[i] = cost[i] + Math.min(M[i-1], M[i-2]);
            }
        }
        return Math.min(M[cost.length - 1], M[cost.length - 2]);
    }
}
