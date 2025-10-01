class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int evenIndex = 0; // Pointer for even positions
        int oddIndex = 1;  // Pointer for odd positions

        while (evenIndex < n && oddIndex < n) {
            // If nums[evenIndex] is even, it's in the right place
            if (nums[evenIndex] % 2 == 0) {
                evenIndex += 2;
            }
            // If nums[oddIndex] is odd, it's in the right place
            else if (nums[oddIndex] % 2 == 1) {
                oddIndex += 2;
            }
            // Swap if both are misplaced
            else {
                int temp = nums[evenIndex];
                nums[evenIndex] = nums[oddIndex];
                nums[oddIndex] = temp;

                evenIndex += 2;
                oddIndex += 2;
            }
        }
        return nums;
    }
}
