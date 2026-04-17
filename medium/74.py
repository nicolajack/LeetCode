class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        #first find the right row
        rl = 0
        rr = len(matrix) - 1
        while rl <= rr:
            mr = (rl + rr) // 2
            if target < matrix[mr][0]:
                # only look in rows up to the previous row
                rr = mr - 1
            elif target > matrix[mr][-1]:
                #only look in rows from the next row
                rl = mr + 1
            else:
                break
        # need to binary search WITHIN that row
        cl = 0
        cr = len(matrix[0]) - 1
        while cl <= cr:
            mc = (cl + cr) // 2
            if target == matrix[mr][mc]:
                return True
            elif target < matrix[mr][mc]:
                cr = mc - 1
            else:
                cl = mc + 1
        return False
