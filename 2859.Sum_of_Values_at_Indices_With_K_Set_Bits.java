import java.util.List;
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;

        // Loop through each index in the list
        for (int i = 0; i < nums.size(); i++) {
            // Check if the index has exactly k set bits in binary
            if (Integer.bitCount(i) == k) {
                // Add the corresponding number to the sum
                sum += nums.get(i);
            }
        }

        // Return the final sum
        return sum;
    }
}
