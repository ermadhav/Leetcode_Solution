class Solution {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(Math.abs(x))); // Convert int to String
        sb.reverse();
        char lastElement = sb.charAt(sb.length() - 1); // Get last character

        if (lastElement == '0') { // Check if last character is '0'
            sb.delete(sb.length() - 1, sb.length()); // Remove trailing zero
        } else if (x < 0) { // If original number was negative
            sb.insert(0, '-'); // Prepend '-'
        }

        try {
            return Integer.parseInt(sb.toString()); // Convert back to int
        } catch (NumberFormatException e) {
            return 0; // Return 0 if overflow occurs
        }
    }
}
