class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int xorSum =0;
        // XOR all elements in derived
        for (int num : derived) {
            xorSum ^= num;
        }
        // If total XOR is 0, a valid original array exists
        return xorSum == 0;
    }
}