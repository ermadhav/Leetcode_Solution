class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Step 1: sum of first k elements
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Step 2: slide the window
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        // Step 3: return average
        return (double) maxSum / k;
    }
}