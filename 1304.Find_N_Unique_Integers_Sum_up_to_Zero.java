class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n]; // Create an array to store the result
        int index = 0; // Initialize index for inserting elements into the array

        // Loop to add pairs of positive and negative integers
        for (int i = 1; i <= n / 2; i++) {
            result[index++] = i;   // Add positive number
            result[index++] = -i;  // Add corresponding negative number
        }

        // If n is odd, add 0 to make the total sum zero
        if (n % 2 != 0) {
            result[index] = 0;
        }

        return result; // Return the result array
    }
}
