class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);              // Sort the array
        int n = nums.length;
        int ans = n;                    // Store minimum removals
        int j = 0;                      // Right pointer

        for (int i = 0; i < n; i++) {
            // Expand window while condition is satisfied
            while (j < n && nums[j] <= (long) k * nums[i]) {
                j++;
            }
            int winsize = j - i;        // Current valid window size
            ans = Math.min(ans, n - winsize); // Update answer
        }
        return ans;                     // Return minimum removals
    }
}
