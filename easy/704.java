class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int middle;
        while (l <= r){
            middle = (nums[(l+r) / 2]);
            if (middle == target){
                return (l+r) / 2;
            } else if (target < middle){
                r = ((l+r) / 2) - 1;
            } else {
                l = ((l+r) / 2) + 1;
            }
        }
        return -1;
    }
}
