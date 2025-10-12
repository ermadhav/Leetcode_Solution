class Solution {
    // Constant modulus value
    private static final int MOD = 1337;

    // Main function to compute a^b % 1337 where b is represented as an array
    public int superPow(int a, int[] b) {
        // Reduce a first to keep it within modulus range
        return helper(a % MOD, b, b.length - 1);
    }

    // Recursive helper function to handle each digit of b from right to left
    private int helper(int a, int[] b, int idx) {
        // Base case: when all digits are processed
        if (idx < 0) return 1;

        // Compute a^(b[idx]) % MOD for the current digit
        int part1 = modPow(a, b[idx]);

        // Compute (a^(previous digits))^10 % MOD recursively
        int part2 = modPow(helper(a, b, idx - 1), 10);

        // Combine both parts using modular multiplication
        return (part1 * part2) % MOD;
    }

    // Fast modular exponentiation for small exponents
    private int modPow(int a, int k) {
        int result = 1;
        a %= MOD;
        for (int i = 0; i < k; i++) {
            result = (result * a) % MOD;
        }
        return result;
    }
}
