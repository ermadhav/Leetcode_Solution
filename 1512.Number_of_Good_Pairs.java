class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0; // To count the number of good pairs
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                // Check if elements are equal and indices form a valid pair (i < j)
                if (nums[i] == nums[j] && i < j) {
                    count++; // Increment count for each good pair
                }
            }
        }
        return count; // Return total number of good pairs
    }
}
