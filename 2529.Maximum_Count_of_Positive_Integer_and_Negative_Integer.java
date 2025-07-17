class Solution {
    public int maximumCount(int[] nums) {
        int ans = 0;
        int minCount = 0; // Count of negative numbers
        int maxCount = 0; // Count of positive numbers

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                minCount++; // Increase count if number is negative
            }
            if (nums[i] > 0) {
                maxCount++; // Increase count if number is positive
            }
            // Keep the max of positive or negative count
            ans = Math.max(minCount, maxCount);
        }

        return ans; // Return the larger count
    }
}
