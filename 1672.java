class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;
        for (int i = 0; i < accounts.length; i++) {
            int current = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                current+=accounts[i][j];
            }
            if (current > richest) {
                    richest = current;
                }
        }
        return richest;
    }
}
