class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;          // length of array
        int[] ans = new int[n];       // result array
        long sum = 0;                 // sliding window sum

        // if k is 0, each element is its own average
        if (k == 0) return nums;

        // initialize result with -1
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        // if window size is larger than array
        if (2 * k + 1 > n) return ans;

        // sliding window to calculate averages
        for (int i = 0; i < n; i++) {
            sum += nums[i];           // add current element to sum

            if (i >= 2 * k) {         // when window size is valid
                ans[i - k] = (int) (sum / (2 * k + 1)); // store average
                sum -= nums[i - 2 * k]; // remove left element
            }
        }
        return ans;
    }
}
