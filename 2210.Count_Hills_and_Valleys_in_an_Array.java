class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;

        // Loop through the array, skipping the first and last elements
        for (int i = 1; i < nums.length - 1; i++) {
            // Skip if the current number is the same as the one before (we want different neighbors)
            if (nums[i] == nums[i - 1]) continue;

            // Find the closest different number on the left
            int left = i - 1;
            while (left >= 0 && nums[left] == nums[i]) {
                left--;
            }
            // If no valid left neighbor, skip this index
            if (left < 0) continue;

            // Find the closest different number on the right
            int right = i + 1;
            while (right < nums.length && nums[right] == nums[i]) {
                right++;
            }
            // If no valid right neighbor, skip this index
            if (right >= nums.length) continue;

            // Check if current number is a hill or a valley
            if ((nums[i] > nums[left] && nums[i] > nums[right]) ||   // Hill
                (nums[i] < nums[left] && nums[i] < nums[right])) {   // Valley
                count++;
            }
        }

        return count;
    }
}
