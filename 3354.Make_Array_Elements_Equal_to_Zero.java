class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length, count = 0;

        // Try all possible starting positions
        for (int i = 0; i < n; i++) {
            // We can only start where nums[i] == 0
            if (nums[i] != 0) continue;

            // Try moving right (dir = 1)
            if (isValid(nums.clone(), i, 1)) count++;

            // Try moving left (dir = -1)
            if (isValid(nums.clone(), i, -1)) count++;
        }

        return count;
    }

    // Simulate the process and check if all elements become 0
    private boolean isValid(int[] nums, int curr, int dir) {
        int n = nums.length;

        while (curr >= 0 && curr < n) {
            if (nums[curr] == 0) {
                // If current element is 0, keep moving in the same direction
                curr += dir;
            } else {
                // If current element > 0, decrement it and reverse direction
                nums[curr]--;
                dir = -dir;
                curr += dir;
            }
        }

        // Check if all elements are 0 at the end
        for (int num : nums) {
            if (num != 0) return false;
        }
        return true;
    }
}
