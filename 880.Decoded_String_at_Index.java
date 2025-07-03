class Solution {
    public String decodeAtIndex(String s, int k) {
        long size = 0;

        // First pass: compute total size of decoded string
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                size *= c - '0'; // Repeat current size
            } else {
                size++; // Add one for each letter
            }
        }

        // Second pass: go backwards to find the k-th character
        for (int i = s.length() - 1; i >= 0; --i) {
            char c = s.charAt(i);
            k %= size; // Reduce k within current size

            // If k is 0 and c is a letter, we've found the result
            if (k == 0 && Character.isLetter(c)) {
                return Character.toString(c);
            }

            if (Character.isDigit(c)) {
                size /= c - '0'; // Undo the repeat
            } else {
                size--; // Undo adding a letter
            }
        }

        return ""; // Should never reach here
    }
}
