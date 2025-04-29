class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;

        // Loop through the array
        while (i < nums.length) {
            // If the current number is not at its correct position
            if (nums[i] != i + 1) {
                // The correct index where the current number should be placed
                int correct = nums[i] - 1;

                // If it's not a duplicate, swap it to the correct position
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    // If both numbers are equal, a duplicate is found
                    return nums[i];
                }
            } else {
                // Move to the next index if the number is at its correct position
                i++;
            }
        }

        // Return -1 if no duplicate is found (should not happen as per problem constraints)
        return -1;
    }

    // Helper function to swap two elements in the array
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
