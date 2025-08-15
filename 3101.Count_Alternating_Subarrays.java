class Solution {
    public long countAlternatingSubarrays(int[] nums) {
        long count = 1; // every single element is an alternating subarray
        int length = 1; // length of current alternating run

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                length++; // extend current alternating run
            } else {
                length = 1; // reset if same as previous
            }
            count += length; // add subarrays ending here
        }
        return count;
    }
}
