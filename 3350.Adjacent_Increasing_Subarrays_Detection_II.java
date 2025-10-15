class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        if (n < 2) return 0;

        // Compute length of strictly increasing subarray starting at each index
        int[] incLen = new int[n];
        incLen[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums.get(i) < nums.get(i + 1)) {
                incLen[i] = incLen[i + 1] + 1;
            } else {
                incLen[i] = 1;
            }
        }

        int maxK = 0;
        // Iterate over possible starting points for the first subarray
        for (int i = 0; i < n - 1; i++) {
            // Maximum k possible starting at i without going out of bounds
            int maxPossibleK = (n - i) / 2;
            for (int k = 1; k <= maxPossibleK; k++) {
                // Check if both subarrays of length k are strictly increasing
                if (incLen[i] >= k && incLen[i + k] >= k) {
                    maxK = Math.max(maxK, k);
                }
            }
        }

        return maxK;
    }
}