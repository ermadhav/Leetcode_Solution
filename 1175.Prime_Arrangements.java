class Solution {
    // Modulo constant for handling large factorial results
    static final int MOD = 1_000_000_007;

    public int numPrimeArrangements(int n) {
        // Count how many numbers from 1 to n are prime
        int primes = 0;
        for (int i = 2; i <= n; i++) 
            if (isPrime(i)) primes++;

        // The answer is factorial(primes) * factorial(non-primes), modulo MOD
        return (int) (fact(primes) * fact(n - primes) % MOD);
    }

    // Helper function to check if a number is prime
    private boolean isPrime(int x) {
        if (x < 2) return false; // Numbers < 2 are not prime
        for (int i = 2; i * i <= x; i++) 
            if (x % i == 0) return false; // If divisible, not prime
        return true; // Otherwise, prime
    }

    // Compute factorial of x modulo MOD
    private long fact(int x) {
        long res = 1;
        for (int i = 2; i <= x; i++) 
            res = res * i % MOD; // Multiply and take modulo each step
        return res;
    }
}
