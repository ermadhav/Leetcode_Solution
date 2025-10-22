class Solution {
    public boolean judgeSquareSum(int c) {
        if (c < 0) return false; // Negative numbers can't be sum of two squares

        long left = 0; // Start pointer
        long right = (long) Math.sqrt(c); // End pointer (largest possible square root)

        // Two-pointer approach
        while (left <= right) {
            long sum = left * left + right * right; // Calculate sum of squares

            if (sum == c) return true; // Found two numbers whose squares sum to c
            if (sum < c) left++;       // Increase left to get a larger sum
            else right--;              // Decrease right to get a smaller sum
        }
        return false; // No valid pair found
    }
}
