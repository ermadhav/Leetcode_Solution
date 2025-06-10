class Solution {
    public int maximumTop(int[] nums, int k) {
        int n = nums.length;

        // Case 1: Only one element and k is odd - cannot make the stack non-empty
        if (n == 1 && k % 2 == 1) return -1;

        // Case 2: If k == 0, we can't remove anything
        if (k == 0) return nums[0];

        // Case 3: If k == 1, we can only remove the top and optionally add one back
        if (k == 1) {
            if (n >= 2) return nums[1]; // return the second element
            else return -1;
        }

        int maxVal = 0;

        // Case 4: If k < n, we can remove up to k elements and put one back
        if (k < n) {
            for (int i = 0; i < k - 1; i++) {
                maxVal = Math.max(maxVal, nums[i]);
            }
            // Also consider the element at index k (after removing k-1 elements and adding back one)
            maxVal = Math.max(maxVal, nums[k]);
            return maxVal;
        } else {
            // Case 5: k >= n, we can remove all and put back any of the previous elements
            for (int i = 0; i < n; i++) {
                maxVal = Math.max(maxVal, nums[i]);
            }
            return maxVal;
        }
    }
}
