class Solution {
    public int[] evenOddBit(int n) {
        int even = 0;  // Count of 1's at even positions
        int odd = 0;   // Count of 1's at odd positions

        // Convert number to binary string
        String binary = Integer.toBinaryString(n);

        // Go through each bit from right (LSB) to left (MSB)
        for(int i = 0; i < binary.length(); i++) {
            // Check bit at position from right side
            if(binary.charAt(binary.length() - 1 - i) == '1') {
                if(i % 2 == 0) {
                    even++;  // If position is even
                } else {
                    odd++;   // If position is odd
                }
            }
        }

        // Return counts
        return new int[]{even, odd};
    }
}
