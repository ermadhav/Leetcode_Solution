class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int total = 0;  // Initialize sum of encrypted numbers

        for (int num : nums) {
            // Convert the number to string so we can check its digits
            String s = String.valueOf(num);

            // Find the largest digit (as char) using stream on the string's chars
            char maxDigit = (char) s.chars().max().getAsInt();

            // Build the encrypted number by repeating the largest digit 
            // for the length of the original number
            int encrypted = Integer.parseInt(String.valueOf(maxDigit).repeat(s.length()));

            // Add encrypted value to the running total
            total += encrypted;
        }

        return total; // Return the sum of all encrypted numbers
    }
}
