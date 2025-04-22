class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than the rightmost element,
            // then the minimum is in the right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // Else the minimum is in the left half (including mid)
                right = mid;
            }
        }

        // When the loop ends, left == right pointing to the smallest element
        return nums[left];
    }
}
