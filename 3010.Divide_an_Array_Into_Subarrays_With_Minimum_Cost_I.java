class Solution {
    public int minimumCost(int[] nums) {
        int n = nums.length;

        int first = nums[0];              // Store the first element
        int min1 = Integer.MAX_VALUE;    // Smallest element after first
        int min2 = Integer.MAX_VALUE;    // Second smallest element after first

        for (int i = 1; i < n; i++) {
            // Update smallest and second smallest values
            if (nums[i] < min1) {
                min2 = min1;
                min1 = nums[i];
            } else if (nums[i] < min2) {
                min2 = nums[i];
            }
        }

        // Return sum of first, smallest, and second smallest
        return first + min1 + min2;
    }
}
