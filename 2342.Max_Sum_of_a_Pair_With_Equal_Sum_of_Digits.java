import java.util.HashMap;

class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>(); // Stores max number for each digit sum
        int maxSum = -1; // Initialize maxSum to -1 (default if no valid pairs exist)

        for (int num : nums) {
            int digitSum = getDigitSum(num); // Compute sum of digits

            // If we have seen this digit sum before, update maxSum
            if (map.containsKey(digitSum)) {
                maxSum = Math.max(maxSum, num + map.get(digitSum));
            }

            // Store the max number for this digit sum
            map.put(digitSum, Math.max(map.getOrDefault(digitSum, 0), num));
        }

        return maxSum; // Return the maximum sum found, or -1 if no valid pair
    }

    // Helper function to calculate sum of digits
    private int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Add last digit to sum
            num /= 10;       // Remove last digit
        }
        return sum;
    }
}
