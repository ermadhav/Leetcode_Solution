class Solution {
    public int reverseDegree(String s) {
        int total = 0;  // Initialize the sum of reverse degree
        // Iterate over each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));  // Convert character to lowercase
            // Check if the character is a lowercase letter from 'a' to 'z'
            if (c >= 'a' && c <= 'z') {
                // Calculate reverse alphabet position: 'a' = 26, ..., 'z' = 1
                int reverse = 26 - (c - 'a');
                // Get position in the string (1-indexed)
                int position = i + 1;
                // Multiply reverse alphabet value by character position and add to total
                total += reverse * position;
            }
        }
        return total;
    }
}