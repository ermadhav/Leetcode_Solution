class Solution {
    public int unequalTriplets(int[] nums) {
        int n = nums.length;  // Get length of the array
        int count = 0;        // Counter for valid triplets

        // First loop: select the first element (i)
        for (int i = 0; i < n - 2; i++) {
            
            // Second loop: select the second element (j), which is after i
            for (int j = i + 1; j < n - 1; j++) {
                
                // Third loop: select the third element (k), which is after j
                for (int k = j + 1; k < n; k++) {
                    
                    // Check if all three elements are pairwise distinct
                    if (nums[i] != nums[j] && nums[i] != nums[k] && nums[j] != nums[k]) {
                        count++; // Found a valid triplet, increment counter
                    }
                }
            }
        }
        return count; // Return total number of valid triplets
    }
}