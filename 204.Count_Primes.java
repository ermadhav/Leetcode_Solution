class Solution {
    public int countPrimes(int n) {
        // Create a boolean array to mark non-prime numbers
        boolean[] prime = new boolean[n];
        int count = 0;

        // Loop through numbers from 2 to n-1
        for (int i = 2; i < n; i++) {
            // If i is not marked, it's a prime
            if (!prime[i]) {
                count++; // Count the prime

                // Mark all multiples of i as non-prime
                for (int j = i * 2; j < n; j += i)
                    prime[j] = true;
            }
        }
        return count; // Return number of primes less than n
    }
}