import java.util.Arrays;

class Solution {
    public int[] transformArray(int[] nums) {
        // Go through each number in the array
        for(int i = 0; i < nums.length; i++) {
            // If the number is even, make it 0
            if(nums[i] % 2 == 0) {
                nums[i] = 0;
            } else {
                // If the number is odd, make it 1
                nums[i] = 1;
            }
        }
        // Sort the array (all 0s will come before 1s)
        Arrays.sort(nums);

        // Return the final array
        return nums;
    }
}
