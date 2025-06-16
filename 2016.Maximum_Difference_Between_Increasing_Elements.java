class Solution {
    public int maximumDifference(int[] nums) {
        int max = -1; // Start with -1 (no valid pair found yet)
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                // If nums[j] is bigger than nums[i] and difference is larger than max
                if(nums[i] < nums[j] && nums[j] - nums[i] > max) {
                    max = nums[j] - nums[i]; // Update max difference
                }
            }
        }
        
        return max; // Return the largest difference found
    }
}
