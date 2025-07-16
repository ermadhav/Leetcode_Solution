class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        long count = 0;

        // Iterate through all pairs (i, j) such that i < j
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                // Calculate the sum of the current pair
                int sum = nums[i] + nums[j];

                // Check if the sum is within the given range [lower, upper]
                if (lower <= sum && sum <= upper) {
                    count++; // If yes, increment the count
                }
            }
        }

        // Return the total number of fair pairs
        return count;
    }
}
