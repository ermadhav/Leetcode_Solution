public class Solution {
    public int divide(int dividend, int divisor) {
        // Special case: overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        // Check if the result should be negative
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert to positive long to avoid overflow
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int result = 0;

        // Subtract divisor from dividend using bit shifts
        while (a >= b) {
            long temp = b;
            int multiple = 1;

            // Double temp until it's bigger than a
            while (a >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            // Subtract and add to result
            a -= temp;
            result += multiple;
        }

        // Return result with correct sign
        return negative ? -result : result;
    }
}
