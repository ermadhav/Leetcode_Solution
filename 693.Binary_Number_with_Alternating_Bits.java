class Solution {
    public boolean hasAlternatingBits(int n) {
        // XOR n with n shifted right by 1 bit
        int x = n ^ (n >> 1);
        // Check if x is all 1's (like 111... in binary)
        // If yes, then x & (x+1) will be 0
        return (x & (x + 1)) == 0;
    }
}