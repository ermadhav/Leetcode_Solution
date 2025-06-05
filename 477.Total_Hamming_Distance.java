class Solution {
    public int totalHammingDistance(int[] nums) {
        int total = 0;
        int n = nums.length;

        // Check each bit position (0 to 31 for 32-bit integers)
        for (int i = 0; i < 32; i++) {
            int countOnes = 0;
            for (int num : nums) {
                // Check if the i-th bit is set
                if ((num & (1 << i)) != 0) {
                    countOnes++;
                }
            }
            int countZeros = n - countOnes;
            total += countOnes * countZeros;
        }

        return total;
    }
}