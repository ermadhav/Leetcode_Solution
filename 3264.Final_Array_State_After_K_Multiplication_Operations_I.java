class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        // Repeat the process k times
        for(int i = 0; i < k; i++) {
            int minIndex = 0;
            // Find the index of the minimum element in the array
            for(int j = 1; j < nums.length; j++) {
                if(nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            // Multiply the minimum element by the given multiplier
            nums[minIndex] *= multiplier;
        }
        // Return the modified array
        return nums;
    }
}
