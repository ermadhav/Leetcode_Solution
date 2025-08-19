class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;   // total number of zero-filled subarrays
        long streak = 0;  // keeps track of current consecutive zeros

        for (int n : nums) {
            if (n == 0) {
                streak++;        // extend the zero streak
                count += streak; // add all subarrays ending at this zero
            } else {
                streak = 0;      // reset streak if non-zero is found
            }
        }
        return count;
    }
}
