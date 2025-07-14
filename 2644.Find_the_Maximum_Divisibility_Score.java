class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int maxCount = -1; // To track maximum number of divisible elements
        int min = Integer.MAX_VALUE; // To store the best divisor

        // Outer loop for each divisor
        for (int j = 0; j < divisors.length; j++) {
            int count = 0; // Reset count for each divisor

            // Inner loop to check how many nums are divisible by current divisor
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % divisors[j] == 0) {
                    count++;
                }
            }

            // Update best divisor if this one gives more count, or same count but smaller value
            if (count > maxCount || (count == maxCount && divisors[j] < min)) {
                maxCount = count;
                min = divisors[j];
            }
        }

        return min; // Return the divisor with the max count (and smallest in case of tie)
    }
}
