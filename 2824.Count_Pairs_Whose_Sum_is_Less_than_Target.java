class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0; // Initialize a counter to keep track of valid pairs

        // Iterate over each element in the list
        for (int i = 0; i < nums.size(); i++) {
            // For each element, iterate over the remaining elements to form pairs
            for (int j = i + 1; j < nums.size(); j++) {
                // Check if the sum of the current pair is less than the target
                if (nums.get(i) + nums.get(j) < target) {
                    count++; // If condition is met, increment the count
                }
            }
        }

        // Return the total count of valid pairs
        return count;
    }
}
