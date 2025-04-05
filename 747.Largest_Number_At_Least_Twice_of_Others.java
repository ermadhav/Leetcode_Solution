class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int maxIndex = 0;

        // Step 1: Find the largest element and its index
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        // Step 2: Check if it's at least twice every other number
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && max < 2 * nums[i]) {
                return -1;
            }
        }

        return maxIndex;
    }
}
