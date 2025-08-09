class Solution {
    public int minOperations(int[] nums, int k) {
        int xor = 0;
        for (int num : nums) xor ^= num; // XOR of all elements
        return Integer.bitCount(xor ^ k); // count differing bits
    }
}
