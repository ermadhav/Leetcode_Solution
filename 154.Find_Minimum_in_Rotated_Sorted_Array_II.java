class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // Binary search loop
        while (left < right) {
            int mid = left + (right - left) / 2;

            // If middle element is greater than the rightmost one,
            // the smallest value must be in the right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } 
            // If middle element is less than the rightmost,
            // the smallest value is at mid or in the left half
            else if (nums[mid] < nums[right]) {
                right = mid;
            } 
            // If middle and rightmost elements are equal,
            // we can't determine the side — safely shrink the right boundary
            else {
                right--;
            }
        }

        // When loop ends, left == right, pointing to the smallest element
        return nums[left];
    }
}
