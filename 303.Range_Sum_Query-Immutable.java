class NumArray {

    private int[] nums;  // Store the input array

    public NumArray(int[] nums) {
        this.nums = nums;  // Initialize the array
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        // Add all elements from index left to right (inclusive)
        for (int i = left; i <= right; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
