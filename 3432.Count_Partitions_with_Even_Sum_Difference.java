class Solution {
    public int countPartitions(int[] nums) {
        int total = 0, left = 0, count = 0;

        // Calculate total sum of the array
        for (int num : nums)
            total += num;

        // Loop through possible split points (excluding last index to keep right
        // non-empty)
        for (int i = 0; i < nums.length - 1; i++) {
            left += nums[i]; // Add current element to left sum

            // Check if the difference between left and right sums is even
            if ((2 * left - total) % 2 == 0)
                count++;
        }

        return count; // Return the number of valid partitions
    }
}