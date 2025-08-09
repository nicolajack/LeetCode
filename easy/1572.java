class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int j = 0;
        for (int i = 0; i < mat.length; i++){
            sum += mat[i][j];
            ++j;
        }
        int n = 0;
        for (int m = mat.length - 1; m >=0; m--){
            sum += mat[m][n];
            ++n;
        }
        if (mat.length % 2 != 0){
            sum -= mat[(mat.length / 2)][(mat.length / 2)];
        }
        return sum;

    }
}
