class Solution {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {

            // Check main diagonal element nums[i][i]
            if (isPrime(nums[i][i])) {
                ans = Math.max(ans, nums[i][i]);
            }

            // Check secondary diagonal element nums[i][n - i - 1]
            if (isPrime(nums[i][n - i - 1])) {
                ans = Math.max(ans, nums[i][n - i - 1]);
            }
        }

        return ans; // Return the largest prime found (or 0 if none)
    }

    // Function to check if a number is prime
    private boolean isPrime(int x) {
        if (x < 2) return false; // primes start from 2

        // Check divisibility up to sqrt(x)
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false; // not prime
        }
        return true; // prime
    }
}
