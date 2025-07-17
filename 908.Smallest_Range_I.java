public int minimumScore(int[] nums, int k) {
    // Initialize min and max values
    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

    // Find the minimum and maximum elements in the array
    for (int num : nums) {
        min = Math.min(min, num);
        max = Math.max(max, num);
    }

    // Calculate the minimum possible score after applying ±k to each element
    // Score can't be negative, so use Math.max with 0
    return Math.max(0, max - min - 2 * k);
}
