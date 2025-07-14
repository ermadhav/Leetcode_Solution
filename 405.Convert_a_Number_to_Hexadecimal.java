class Solution {
    public String toHex(int num) {
        // If the input number is zero, return "0"
        if (num == 0) return "0";

        // Initialize an empty string to store the hexadecimal representation
        String hex = "";

        // Character array containing hexadecimal digits
        char[] hexChars = "0123456789abcdef".toCharArray();

        // Loop at most 8 times (since 32 bits / 4 bits per hex digit = 8 digits)
        // Stop early if num becomes 0
        for (int i = 0; i < 8 && num != 0; i++) {
            // Get the last 4 bits of num (equivalent to num % 16)
            int remainder = num & 15;

            // Get the corresponding hex character and prepend it to the result
            hex = hexChars[remainder] + hex;

            // Unsigned right shift by 4 bits to process the next 4 bits
            num >>>= 4;
        }

        // Return the final hexadecimal string
        return hex;
    }
}
