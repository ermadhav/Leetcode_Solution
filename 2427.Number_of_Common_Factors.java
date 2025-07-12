class Solution {
    public int commonFactors(int a, int b) {
        int ans = 0;
        int n = Math.min(a, b); // Limit check up to the smaller of a and b

        // Check all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // If i divides both a and b, it's a common factor
            if (a % i == 0 && b % i == 0) {
                ans++; // Increment count
            }
        }

        return ans; // Return total common factors
    }
}
