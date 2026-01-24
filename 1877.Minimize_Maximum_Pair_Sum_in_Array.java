class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);              // Sort the array in ascending order
        int left = 0;                   // Pointer to smallest element
        int right = nums.length - 1;    // Pointer to largest element
        int maxSum = 0;                 // Store maximum pair sum

        while (left < right) {          
            int pairSum = nums[left] + nums[right]; // Pair smallest with largest
            maxSum = Math.max(maxSum, pairSum);     // Update max pair sum
            left++;                     // Move left pointer forward
            right--;                    // Move right pointer backward
        }
        return maxSum;                  // Return minimized maximum pair sum
    }
}
