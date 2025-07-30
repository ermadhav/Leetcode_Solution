import java.util.ArrayList;

class Solution {
    public int longestSubarray(int[] nums) {
        // List to store the bitwise AND values of all subarrays
        List<Integer> list = new ArrayList<>();

        // Initialize max with AND of the first element (safe start)
        int max = nums[0] & nums[0];

        // Outer loop: choose starting index of subarray
        for (int i = 0; i < nums.length; i++) {
            // Middle loop: choose ending index of subarray
            for (int j = i; j < nums.length; j++) {
                // Start with nums[i], then AND with the rest
                int andVal = nums[i];

                // Inner loop: compute AND of elements from i to j
                for (int k = i + 1; k <= j; k++) {
                    andVal &= nums[k];
                }

                // Update maximum AND found so far
                max = Math.max(max, andVal);

                // Store this subarray's AND result in the list
                list.add(andVal); 
            }
        }

        // Now, find the longest contiguous streak of AND values equal to max
        int longest = 0;  // longest streak length
        int current = 0;  // current streak length

        for (int val : list) {
            if (val == max) {
                current++; // extend the streak
                longest = Math.max(longest, current); // update best
            } else {
                current = 0; // reset streak if value != max
            }
        }

        // Return the length of the longest subarray
        return longest;
    }
}
