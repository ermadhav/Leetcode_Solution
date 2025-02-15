class Solution {
    public int thirdMax(int[] nums) {
        // Initialize three variables to track the top three distinct maximums
        long first = Long.MIN_VALUE, second = Long.MIN_VALUE, third = Long.MIN_VALUE;
        boolean hasMinValue = false; // To handle cases where nums contains Integer.MIN_VALUE

        for (int num : nums) {
            // Skip if the number is already recorded in one of the top three
            if (num == first || num == second || num == third) {
                continue;
            }

            // Update the first, second, and third maximums accordingly
            if (num > first) {
                third = second;  // Move second to third
                second = first;  // Move first to second
                first = num;     // Update first to the new maximum
            } else if (num > second) {
                third = second;  // Move second to third
                second = num;    // Update second to the new value
            } else if (num > third) {
                third = num;     // Update third to the new value
            }
            
            // Track if Integer.MIN_VALUE exists in the array
            if (num == Long.MIN_VALUE) {
                hasMinValue = true;
            }
        }

        // If we found a third maximum, return it; otherwise, return the first maximum
        return (third != Long.MIN_VALUE || hasMinValue) ? (int) third : (int) first;
    }
}
