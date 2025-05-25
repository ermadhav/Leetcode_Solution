class Solution {
    public long maxScore(int[] nums) {
        int n = nums.length;

        // Arrays to store prefix and suffix GCDs
        int[] pre = new int[n + 1], suf = new int[n + 2];

        // Compute prefix GCDs
        for (int i = 0; i < n; i++) {
            pre[i + 1] = gcd(pre[i], nums[i]);
        }

        // Compute suffix GCDs
        for (int i = n - 1; i >= 0; i--) {
            suf[i + 1] = gcd(suf[i + 2], nums[i]);
        }

        long max = 0;

        // Try removing each element and compute factor score
        for (int i = 0; i < n; i++) {
            int g = gcd(pre[i], suf[i + 2]); // GCD without nums[i]
            long l = 1;

            // Compute LCM of the rest of the elements
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    l = lcm(l, nums[j]);
                }
            }

            // Update max factor score
            max = Math.max(max, l * g);
        }

        // Also consider case without removing any element
        long fullGCD = nums[0], fullLCM = nums[0];
        for (int i = 1; i < n; i++) {
            fullGCD = gcd((int) fullGCD, nums[i]);
            fullLCM = lcm(fullLCM, nums[i]);
        }

        // Return the maximum score
        return Math.max(max, fullGCD * fullLCM);
    }

    // Euclidean algorithm to find GCD
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Function to compute LCM using GCD
    static long lcm(long a, long b) {
        return a / gcd((int) a, (int) b) * b;
    }
}
