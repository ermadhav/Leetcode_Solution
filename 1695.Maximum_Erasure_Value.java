import java.util.HashSet;
import java.util.Set;

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>(); // To store unique elements in the current window
        int left = 0, sum = 0, max = 0;

        // Loop through each element with the right pointer
        for (int right = 0; right < nums.length; right++) {

            // If nums[right] is already in the set, move left pointer to remove duplicates
            while (set.contains(nums[right])) {
                set.remove(nums[left]); // Remove from set
                sum -= nums[left]; // Subtract from current sum
                left++; // Shrink the window from the left
            }

            // Add the current number to set and sum
            set.add(nums[right]);
            sum += nums[right];

            // Update max sum if current sum is higher
            max = Math.max(max, sum);
        }

        return max; // Return the highest score (max sum of unique subarray)
    }
}