class Solution {
    // Define the modulo value as a constant (10^9 + 7)
    int mod = 1000000007;

    // Helper method to calculate (a^b) % mod using fast exponentiation
    long findPower(long a, long b) {
        if (b == 0)
            return 1; // Base case: a^0 = 1

        // Recursively compute a^(b/2)
        long half = findPower(a, b / 2);
        // Square the result and take modulo
        long result = (half * half) % mod;

        // If exponent is odd, multiply one more 'a' and take modulo
        if (b % 2 == 1) {
            result = (result * a) % mod;
        }

        return result;
    }

    // Main method to count the number of good numbers of length n
    public int countGoodNumbers(long n) {
        // Digits at even indices (0-based) can be 0, 2, 4, 6, 8 → 5 choices
        long part1 = findPower(5, (n + 1) / 2);

        // Digits at odd indices can be 2, 3, 5, 7 → 4 choices
        long part2 = findPower(4, n / 2);

        // Total combinations = (5^((n+1)/2) * 4^(n/2)) % mod
        return (int) ((part1 * part2) % mod);
    }
}
