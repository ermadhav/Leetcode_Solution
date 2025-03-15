class Solution {
    public int mySqrt(int x) {
        // Base cases: If x is 0 or 1, return x as the square root.
        if (x == 0 || x == 1) return x;

        int left = 1, right = x, ans = 0;

        // Perform binary search between 1 and x
        while (left <= right) {
            // Calculate the middle value to prevent overflow
            int mid = left + (right - left) / 2;

            // Use division instead of multiplication to avoid overflow: mid * mid <= x
            if (mid <= x / mid) { 
                ans = mid;      // Update the possible answer
                left = mid + 1; // Try to find a larger square root
            } else {
                right = mid - 1; // Reduce the search space
            }
        }

        // The final answer is stored in `ans`, which is the largest integer whose square is ≤ x.
        return ans;
    }
}
