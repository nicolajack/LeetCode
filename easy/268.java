class Solution {
    public int missingNumber(int[] nums) {
        int range = 0;
        int sum = 0;
        int i = 0;
        int j = 0;
        while (i < nums.length){
            sum += nums[i];
            range += i;
            ++i;
        }
        while (i <= nums.length){
            range += i;
            ++i;
        }
        

        return range-sum;
    }
}
