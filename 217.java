class Solution {
    public boolean containsDuplicate(int[] nums) {
        /* make hashset, bc hashset doesnt take dupes, if size of hashset < len nums, true, else false */
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        if (set.size() < nums.length){
            return true;
        } else {
            return false;
        }
    }
}
