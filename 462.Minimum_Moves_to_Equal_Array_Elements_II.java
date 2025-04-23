class Solution {
    public int minMoves2(int[] nums) {
        // Sort the array using bubble sort
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                // If the current number is smaller than the previous one, swap them
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }

        // Find the median (middle value in the sorted array)
        // This helps minimize the total moves needed
        int median = nums[nums.length / 2];

        int ans = 0;
        // Calculate the total moves needed by summing absolute differences from median
        for (int i = 0; i < nums.length; i++) {
            ans = ans + Math.abs(nums[i] - median);
        }

        // Return the total number of moves
        return ans;
    }
}
