class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left = 0; // Left pointer of sliding window
        int mask = 0; // Bitmask representing OR of all elements in current window
        int maxLen = 1; // Track max length of nice subarray found

        for (int right = 0; right < nums.length; right++) {
            // If current element shares any bit with mask, shrink window from left
            while ((mask & nums[right]) != 0) {
                mask ^= nums[left]; // Remove left element's bits from mask
                left++; // Move left pointer forward
            }
            mask |= nums[right]; // Add current element's bits to mask
            maxLen = Math.max(maxLen, right - left + 1); // Update max length
        }
        return maxLen;
    }
}