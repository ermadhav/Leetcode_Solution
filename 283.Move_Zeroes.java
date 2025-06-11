class Solution {
    // Move all zeroes to the end of the array
    public void moveZeroes(int[] nums) {
        int k = 0; // next place for non-zero

        // Move non-zero numbers forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }

        // Fill the rest with zeroes
        while (k < nums.length) {
            nums[k] = 0;
            k++;
        }
    }
}
