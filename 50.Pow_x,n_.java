class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1; // Base case

        // Handle negative exponent
        long exp = n; // Use long to prevent overflow
        
        if (exp < 0) {
            x = 1 / x;
            exp = -exp; // Convert to positive safely
        }

        double result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) { // If exp is odd, multiply x with result
                result *= x;
            }
            x *= x; // Square x
            exp /= 2; // Reduce exponent
        }
        return result;
    }
}