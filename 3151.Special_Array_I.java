class Solution {
    public boolean isArraySpecial(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        
        for (int i = 0; i < nums.length - 1; i++) { // Avoid out-of-bounds error
            if (nums[i] % 2 == nums[i + 1] % 2) { // Adjacent numbers should not have the same parity
                return false;
            }
        }
        return true; // If all pairs follow the pattern, return true
    }
}
