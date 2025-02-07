class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n]; // Initialize ans with twice the size of nums
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];        // Copy the original array
            ans[i + n] = nums[i];    // Copy again to form the concatenation
        }
        return ans;
    }
}
