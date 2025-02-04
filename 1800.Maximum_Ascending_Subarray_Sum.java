class Solution {
    public int maxAscendingSum(int[] nums) {
        int num1 = nums[0];  // Start with the first element
        int max = num1;  // Track the maximum sum

        for (int i = 1; i < nums.length; i++) {  // Start from the second element
            if (nums[i] > nums[i - 1]) {  
                num1 += nums[i];  // Continue the ascending subarray
            } else {
                max = Math.max(max, num1);  // Update max when the sequence breaks
                num1 = nums[i];  // Reset num1 for the new subarray
            }
        }
        return Math.max(max, num1);  // Final max update to include last subarray
    }
}
