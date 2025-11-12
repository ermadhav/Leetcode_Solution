class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int g = nums[0];
        
        // Find GCD of the entire array
        for (int x : nums) g = gcd(g, x);
        if (g > 1) return -1; // If total GCD > 1, it's impossible to make all 1s
        
        int ones = 0;
        // Count number of 1s in the array
        for (int x : nums) if (x == 1) ones++;
        if (ones > 0) return n - ones; // If we already have 1s, make others 1
        
        int minLen = n;
        // Find smallest subarray with GCD = 1
        for (int i = 0; i < n; i++) {
            g = nums[i];
            for (int j = i + 1; j < n; j++) {
                g = gcd(g, nums[j]);
                if (g == 1) {
                    minLen = Math.min(minLen, j - i + 1);
                    break;
                }
            }
        }
        // (minLen - 1) to create one '1', (n - 1) to spread it to all elements
        return (minLen - 1) + (n - 1);
    }

    // Helper method to find GCD
    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
