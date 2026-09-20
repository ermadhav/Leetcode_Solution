class Solution {
    public int maximizeSum(int[] nums, int k) {
        // sorting beacuse we need the last largest no.
        Arrays.sort(nums);
        int l = nums.length-1;
        int ans = nums[l]*k+ (k*(k-1)/2);
        return ans;
    }
}