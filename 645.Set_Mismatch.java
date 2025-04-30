class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;

        // Place each number at the correct index (nums[i] -> index nums[i] - 1)
        while (i < nums.length) {
            int correct = nums[i] - 1;

            // Swap only if current number is not at the correct position
            // and it's not a duplicate (to avoid infinite loop)
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // After sorting, find the one number that is incorrect
        for (i = 0; i < nums.length; i++) {
            // If number is not in the correct position
            if (nums[i] != i + 1) {
                // nums[i] is duplicate, i+1 is missing
                return new int[]{nums[i], i + 1};
            }
        }

        // Default return if no error found (shouldn't happen with valid input)
        return new int[]{-1, -1};
    }

    // Swap values in the array
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
