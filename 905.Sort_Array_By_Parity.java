class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0, j = nums.length - 1; // Two pointers: i at start, j at end

        while (i < j) { // Loop until pointers meet
            // If left is odd and right is even, swap them
            if (nums[i] % 2 > nums[j] % 2) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            // Move left pointer forward if it points to even
            if (nums[i] % 2 == 0)
                i++;
            // Move right pointer backward if it points to odd
            if (nums[j] % 2 == 1)
                j--;
        }
        return nums; // Return the modified array
    }
}