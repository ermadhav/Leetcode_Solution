class Solution {
    public int maxScore(String s) {
        int max = 0;      // To keep track of the maximum score
        int zeros = 0;    // Count of zeros on the left side
        int ones = 0;     // Count of ones on the right side

        // First, count all the ones in the string (initially on the right side)
        for (char c : s.toCharArray()) {
            if (c == '1') ones++;
        }

        // Go through the string and simulate splitting it
        // We stop at length - 1 to keep both parts non-empty
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                zeros++; // Move a zero to the left part
            } else {
                ones--; // Move a one out of the right part
            }

            // Score = zeros on the left + ones on the right
            max = Math.max(max, zeros + ones);
        }

        return max; // Return the maximum score found
    }
}