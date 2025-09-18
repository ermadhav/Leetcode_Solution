class Solution {
    public int maximumXOR(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result |= num; // bitwise OR accumulates all available bits
        }
        return result;
    }
}