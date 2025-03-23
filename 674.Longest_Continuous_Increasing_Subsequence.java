class Solution {
    public int findLengthOfLCIS(int[] nums) {

        int maxLength = 1, count = 1; // Track longest and current sequence length

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i - 1]) { // If the sequence continues
                count++; // Increase count
                maxLength = Math.max(maxLength, count); // Update max length
            } else {
                count = 1; // Reset count if sequence breaks
            }
        } 

        return maxLength; // Return longest increasing sequence length
    }
}
