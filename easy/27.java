class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        int l = 0;
        int r = nums.length - 1;
        while (l <= r){
            if (nums[l] == val){
                nums[l] = nums[r];
                --r;
                --k;
            } else {
                ++l;
            }
        }
        return k;
    }
}
