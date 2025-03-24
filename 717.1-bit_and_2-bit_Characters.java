class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int l = bits.length;
        int i = 0;

        while (i < l - 1) { // Traverse until the second-last character
            if (bits[i] == 1) {
                i += 2; // Skip the next bit since '1' starts a two-bit character
            } else {
                i += 1; // Move one step if '0' is a single-bit character
            }
        }

        return i == l - 1; // If we stop at the last bit, it's a one-bit character
    }
}
