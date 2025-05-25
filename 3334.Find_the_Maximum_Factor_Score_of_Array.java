class Solution {
    public long maxScore(int[] nums) {
        int n = nums.length;  // Length of the input array

        // Arrays to store prefix and suffix GCD and LCM values
        int[] prefixGCD = new int[n + 1];
        int[] suffixGCD = new int[n + 2];
        long[] prefixLCM = new long[n + 1];
        long[] suffixLCM = new long[n + 2];

        prefixGCD[0] = 0;   // GCD identity for prefix (0 means no numbers yet)
        prefixLCM[0] = 1;   // LCM identity for prefix (1 is neutral for multiplication)

        // Calculate prefix GCD and LCM from left to right
        for (int i = 0; i < n; i++) {
            prefixGCD[i + 1] = gcd(prefixGCD[i], nums[i]);
            prefixLCM[i + 1] = lcm(prefixLCM[i], nums[i]);
        }

        suffixGCD[n + 1] = 0;  // GCD identity for suffix (beyond the end)
        suffixLCM[n + 1] = 1;  // LCM identity for suffix (beyond the end)

        // Calculate suffix GCD and LCM from right to left
        for (int i = n - 1; i >= 0; i--) {
            suffixGCD[i + 1] = gcd(suffixGCD[i + 2], nums[i]);
            suffixLCM[i + 1] = lcm(suffixLCM[i + 2], nums[i]);
        }

        long maxScore = 0;

        // Try splitting array at every position i
        for (int i = 0; i < n; i++) {
            // GCD of all elements except nums[i]
            int g = gcd(prefixGCD[i], suffixGCD[i + 2]);
            // LCM of all elements except nums[i]
            long l = lcm(prefixLCM[i], suffixLCM[i + 2]);
            maxScore = Math.max(maxScore, g * l);  // Update maxScore if bigger found
        }

        // Also consider the whole array (no removal)
        maxScore = Math.max(maxScore, (long) prefixGCD[n] * prefixLCM[n]);

        return maxScore;
    }

    // GCD for int values (used for prefix and suffix GCD arrays)
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Overloaded GCD for long values (used in LCM calculation to avoid overflow)
    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Calculate LCM safely using gcd to prevent overflow
    static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}
