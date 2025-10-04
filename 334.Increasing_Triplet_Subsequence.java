class Solution {
    public boolean increasingTriplet(int[] nums) {
        // Edge case: less than 3 elements
        if (nums == null || nums.length < 3)
            return false;

        int first = Integer.MAX_VALUE;  // smallest number
        int second = Integer.MAX_VALUE; // second smallest number

        for (int n : nums) {
            if (n <= first) {
                first = n;  // update smallest
            } else if (n <= second) {
                second = n; // update second smallest
            } else {
                return true; // found third larger -> triplet exists
            }
        }

        return false; // no triplet found
    }
}
