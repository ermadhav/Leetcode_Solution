class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones = 0;
        int zeros = 0;

        // Count the number of 1s and 0s
        for (char c : s.toCharArray()) {
            if (c == '1') ones++;
            else zeros++;
        }

        // Build the result:
        // - (ones - 1) '1's at the start
        // - all '0's in the middle
        // - 1 '1' at the end to make the number odd
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < ones - 1; i++) {
            result.append('1');
        }
        for (int i = 0; i < zeros; i++) {
            result.append('0');
        }
        result.append('1'); // to ensure the number is odd

        return result.toString();
    }
}
