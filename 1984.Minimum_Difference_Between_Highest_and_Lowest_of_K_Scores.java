class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1)
            return 0; // Only one student → no difference

        Arrays.sort(nums); // Sort scores

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i + k - 1 < nums.length; i++) {
            int diff = nums[i + k - 1] - nums[i]; // High - Low
            minDiff = Math.min(minDiff, diff); // Keep minimum
        }

        return minDiff; // Final answer
    }
}