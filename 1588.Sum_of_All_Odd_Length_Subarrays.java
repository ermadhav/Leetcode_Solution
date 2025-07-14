class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int total = 0;

        // Loop through all possible starting points
        for (int start = 0; start < arr.length; start++) {
            // Loop through all possible ending points
            for (int end = start; end < arr.length; end++) {
                int length = end - start + 1; // Calculate the length of subarray

                // Check if subarray length is odd
                if (length % 2 == 1) {
                    int sum = 0;

                    // Calculate the sum of the current subarray
                    for (int i = start; i <= end; i++) {
                        sum += arr[i];
                    }

                    // Add the subarray sum to the total
                    total += sum;
                }
            }
        }

        return total; // Return the total sum of all odd-length subarrays
    }
}