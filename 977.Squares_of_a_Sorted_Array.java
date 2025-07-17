import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        // Step 1: Square each element and take absolute value
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i] * nums[i]);
        }

        // Step 2: Sort the squared elements
        Arrays.sort(nums);

        // Step 3: Return the sorted array
        return nums;
    }
}
