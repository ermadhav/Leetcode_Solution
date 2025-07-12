class Solution {
    public int minMoves(int target, int maxDoubles) {
        int moves = 0;

        // Start from target and move backward to 1
        while (target > 1 && maxDoubles > 0) {
            if (target % 2 == 0) {
                // If target is even, divide by 2 (reverse of doubling)
                target /= 2;
                maxDoubles--; // One double operation used
            } else {
                // If target is odd, subtract 1 (reverse of increment)
                target -= 1;
            }
            moves++; // Count the operation
        }

        // If we can't double anymore, we need to do (target - 1) increments
        // to reach 1
        moves += (target - 1);

        return moves;
    }
}
