class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        if (n < 2 * k) return false; // not enough elements for 2 subarrays
        if (k == 1) return true; // any two adjacent elements work

        // check for subarrays of length k
        for (int i = 0; i <= n - 2 * k; i++) {
            boolean first = true, second = true;

            // first subarray
            for (int j = i + 1; j < i + k; j++)
                if (nums.get(j) <= nums.get(j - 1)) first = false;

            // second subarray
            for (int j = i + k + 1; j < i + 2 * k; j++)
                if (nums.get(j) <= nums.get(j - 1)) second = false;

            if (first && second) return true;
        }

        return false;
    }
}
