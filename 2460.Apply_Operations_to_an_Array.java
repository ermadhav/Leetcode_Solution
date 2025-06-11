class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;

        // Merge equal adjacent numbers
        for(int i = 0; i < n - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        // Move non-zero numbers to the front
        int k = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] != 0) {
                nums[k++] = nums[i];
            }
        }

        // Fill remaining positions with 0
        while(k < n) {
            nums[k++] = 0;
        }

        return nums;
    }
}
