class Solution {
    public int countKDifference(int[] nums, int k) {
        int n = nums.length;
        int count = 0; // Initialize counter for valid pairs

        // Loop through each pair (i, j) where i < j
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Check if absolute difference is equal to k
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count++; // Increment count if condition is met
                }
            }
        }
        return count; // Return total number of valid pairs
    }
}
