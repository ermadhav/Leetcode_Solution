class Solution {
    public int smallestNumber(int n) {
        int k = 1;
        // Keep increasing k until (2^k - 1) >= n
        while ((1 << k) - 1 < n) {
            k++;
        }
        // Return number with all bits set: 2^k - 1
        return (1 << k) - 1;
    }
}