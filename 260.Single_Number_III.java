class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        // XOR all numbers to get a ^ b
        for (int num : nums) xor ^= num;

        // Find a bit where a and b are different
        int diff = xor & -xor;

        int a = 0, b = 0;
        // Split numbers into two groups and XOR separately
        for (int num : nums) {
            if ((num & diff) == 0) a ^= num;
            else b ^= num;
        }

        // a and b are the unique numbers
        return new int[]{a, b};
    }
}
