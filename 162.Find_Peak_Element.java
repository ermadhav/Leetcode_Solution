class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than the next one, we are in a descending part
            if (nums[mid] > nums[mid + 1]) {
                // So the peak lies on the left (including mid)
                right = mid;
            } else {
                // Else the peak lies on the right
                left = mid + 1;
            }
        }

        // Left and right converge to the peak element index
        return left;
    }
}
