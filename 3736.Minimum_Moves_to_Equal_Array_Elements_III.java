class Solution {
    public int minMoves(int[] nums) {
        // Find the maximum value in the array
        int max = nums[0];
        for (int n : nums)
            if (n > max) max = n;

        // Count how many increments are needed to reach the max value
        int moves = 0;
        for (int n : nums)
            moves += max - n;

        return moves; // Total moves
    }
}
