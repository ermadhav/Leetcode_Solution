class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;

        // Place each number in its correct index if possible
        while (i < nums.length) {
            int correct = nums[i] - 1;

            // Check if the number is in the range 1 to n, and not already at the right place
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct); // Swap to correct position
            } else {
                i++; // Move to next index
            }
        }

        // After placement, the first place where index+1 != value is the missing positive
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }

        // If all numbers from 1 to n are present, return n+1
        return nums.length + 1;
    }

    // Helper method to swap elements in the array
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
