class Solution(object):
    def twoSum(self, numbers, target):
        """
        :type numbers: List[int]
        :type target: int
        :rtype: List[int]
        """
        i = 0
        j = len(numbers) - 1
        sol = [1,1]
        while i < j:
            if numbers[i] + numbers[j] == target:
                sol[0] += i
                sol[1] += j
                break
            elif numbers[i] + numbers[j] > target:
                j -= 1
            else:
                i += 1
        return sol
