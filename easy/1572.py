class Solution(object):
    def diagonalSum(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: int
        """
        sum = 0
        i = 0
        j = len(mat) - 1
        while i < len(mat):
            sum += mat[i][i]
            sum += mat[j][i]
            i += 1
            j -= 1
        if len(mat) % 2 != 0:
            sum -= mat[len(mat) / 2][len(mat) / 2]
        return sum
        
