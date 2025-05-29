class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;

        // Go through all 32 bits of an integer
        for (int i = 0; i < 32; i++) {
            int bitSum = 0;

            for (int num : nums) {
                // Count the i-th bit for all numbers
                bitSum += (num >> i) & 1;
            }

            // If the bit count is not divisible by 3, it belongs to the unique number
            if (bitSum % 3 != 0) {
                result |= (1 << i);
            }
        }

        // Handle negative numbers
        if ((result & (1 << 31)) != 0) {
            result -= (1 << 32);
        }

        return result;
    }
}