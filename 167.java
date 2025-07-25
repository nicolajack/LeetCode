class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int[] sol = new int[2];
        while (i < j){
            if (numbers[i] + numbers[j] == target){
                sol[0] = i + 1;
                sol[1] = j + 1;
                return sol;
            } else if (numbers[i] + numbers[j] > target){
                --j;
            } else {
                ++i;
            }
        }
        return sol;
    }
}
