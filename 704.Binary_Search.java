class Solution {
    public int search(int[] nums, int target) {
        // Initialize the start and end pointers for binary search
        int start = 0;
        int end = nums.length - 1;

        // Continue searching while the search space is valid
        while (start <= end) {
            // Calculate the mid index to avoid potential overflow
            int mid = start + (end - start) / 2;

            // If the target is less than the middle element, search the left half
            if (target < nums[mid]) {
                end = mid - 1;
            }
            // If the target is greater than the middle element, search the right half
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            // If the target is equal to the middle element, return its index
            else {
                return mid;
            }
        }

        // If the target is not found, return -1
        return -1;
    }
}
