class Solution {
    public int maxAdjacentDistance(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0; 
        }
        int n = nums.length;
        int maxDiff = 0;
        // Loop through all elements
        for (int i = 0; i < n; i++) {
            int nextIndex = (i + 1) % n; // Get next index (circular)
            int diff = Math.abs(nums[i] - nums[nextIndex]); // Absolute difference
            maxDiff = Math.max(maxDiff, diff); // Update max difference
        }
        return maxDiff; // Return final result
    }
}