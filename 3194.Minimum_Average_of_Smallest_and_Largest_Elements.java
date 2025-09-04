class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums); // Step 1: Sort the array
        double ans = Double.MAX_VALUE; // Initialize min average as infinity

        // Step 2: Pair smallest with largest, compute averages
        for (int i = 0; i < nums.length / 2; i++)
            ans = Math.min(ans, (nums[i] + nums[nums.length - 1 - i]) / 2.0);

        return ans; // Step 3: Return the minimum average
    }
}