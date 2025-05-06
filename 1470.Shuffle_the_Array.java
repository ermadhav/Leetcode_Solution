class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];        // First half
            ans[2 * i + 1] = nums[i + n]; // Second half
        }
        return ans;
    }
}
