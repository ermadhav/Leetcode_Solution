public class Solution {

    // Method to check whether a given number is a perfect square
    public boolean isPerfectSquare(int num) {
        // Numbers 0 and 1 are perfect squares
        if (num < 2) {
            return true;
        }

        // Initialize binary search bounds
        int left = 2;
        int right = num / 2;

        // Perform binary search
        while (left <= right) {
            // Calculate the midpoint to avoid overflow
            int mid = left + (right - left) / 2;

            // Compute square using long to prevent integer overflow
            long square = (long) mid * mid;

            // Check if mid * mid equals num
            if (square == num) {
                return true;
            }
            // If square is less than num, discard the left half
            else if (square < num) {
                left = mid + 1;
            }
            // If square is greater than num, discard the right half
            else {
                right = mid - 1;
            }
        }

        // If no perfect square found, return false
        return false;
    }
}
