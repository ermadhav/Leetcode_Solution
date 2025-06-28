class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int ans = 0;
        
        // Loop through numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // Check if i is a divisor of n
            if (n % i == 0) {
                // Add the square of the (i-1)th element to the answer
                ans += nums[i - 1] * nums[i - 1];
            }
        }
        
        // Return the final sum
        return ans;
    }
}
