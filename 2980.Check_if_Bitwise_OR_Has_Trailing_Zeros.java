class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int evenCount = 0;
        // Count how many numbers are even
        for (int num : nums) {
            if ((num & 1) == 0) { // Check if num is even using bitwise AND
                evenCount++;
            }
        }
        // Return true if there are at least two even numbers
        return evenCount >= 2;
    }
}
