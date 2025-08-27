class Solution {
    public int reverseBits(int n) {
        int result = 0; // store reversed bits
        for (int i = 0; i < 32; i++) {
            result = (result << 1) | (n & 1); // shift left & add LSB of n
            n >>>= 1; // unsigned right shift n
        }
        return result; // reversed number
    }
}
