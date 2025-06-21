class Solution {
    public int subarraySum(int[] nums) {
        int sum = 0;  // Temporary variable to hold sum of current subarray
        // Loop through each index in the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the starting index of the subarray for current i
            int start = Math.max(0, i - nums[i]);

            // Reset sum for this subarray
            sum = 0;

            // Sum all elements from 'start' to current index 'i'
            for (int j = start; j <= i; j++) {
                sum += nums[j];
            }

        }

        // Return the total sum of all defined subarrays
        return sum;
    }
}
