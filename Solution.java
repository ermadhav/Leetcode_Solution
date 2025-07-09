public class Solution {

    // Method to calculate minimum insertions needed to balance the string
    public int minInsertions(String s) {
        int res = 0;     // Total insertions required
        int open = 0;    // Count of unmatched '('
        int i = 0;       // Pointer to loop through the string

        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                // Found an opening bracket, need two ')' to match it
                open++;
                i++;
            } else {
                // Found a closing bracket ')'
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    // It's a pair '))'
                    if (open > 0) open--;   // Match with an existing '('
                    else res++;             // No '(', so insert one '('
                    i += 2;                 // Move past the pair
                } else {
                    // It's a single ')'
                    if (open > 0) open--;   // Match with an existing '('
                    else res++;             // No '(', so insert one '('
                    res++;                  // Also need one more ')' to complete the pair
                    i++;                    // Move to next character
                }
            }
        }

        // For each unmatched '(', we need to insert two ')'
        res += open * 2;

        return res;
    }

    // Main method to test the code
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test input
        String s = "(()))";

        // Output the result
        System.out.println(sol.minInsertions(s));  // Expected output: 1
    }
}
