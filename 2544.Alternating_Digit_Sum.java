class Solution {
    public int alternateDigitSum(int n) {
        // Convert the integer to a string to access individual digits
        String numStr = String.valueOf(n);
        int ans = 0;

        // Iterate through each character in the string
        for (int i = 0; i < numStr.length(); i++) {
            // Convert character digit to its integer value
            int digit = numStr.charAt(i) - '0';

            // Add or subtract digit based on its position
            if (i % 2 == 0) {
                ans += digit; // Even index: add digit
            } else {
                ans -= digit; // Odd index: subtract digit
            }
        }

        // Return the final alternating sum
        return ans;
    }
}
