class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int total = 0;

        // Total number of subsets = 2^n
        int subsets = 1 << n;

        // Loop through all possible subsets
        for (int i = 0; i < subsets; i++) {
            int xor = 0;

            // Build subset based on bits of i
            for (int j = 0; j < n; j++) {
                // If j-th bit in i is set, include nums[j] in subset
                if ((i & (1 << j)) != 0) {
                    xor ^= nums[j]; // XOR the current element
                }
            }

            // Add the XOR of this subset to the total sum
            total += xor;
        }

        // Return the sum of XORs of all subsets
        return total;
    }
}
