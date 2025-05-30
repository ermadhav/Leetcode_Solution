class Solution {
    public int countPairs(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        
        // Loop through all pairs (i, j) with i < j
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Check both conditions
                if (nums[i] == nums[j] && (i * j) % k == 0) {
                    count++; // Valid pair found
                }
            }
        }

        return count;
    }
}
