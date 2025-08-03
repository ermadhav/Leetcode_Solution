class Solution {
    public String countAndSay(int n) {
        // Base sequence starts with "1"
        String s = "1";

        // Build the sequence from 2 up to n
        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            int count = 1;

            // Iterate through the current sequence string
            for (int j = 1; j <= s.length(); j++) {
                // If the current char is same as previous, increment the count
                if (j < s.length() && s.charAt(j) == s.charAt(j - 1)) {
                    count++;
                } else {
                    // Otherwise, append count and the digit
                    sb.append(count).append(s.charAt(j - 1));
                    // Reset count for the next group
                    count = 1;
                }
            }
            
            // Update the sequence with the new generated value
            s = sb.toString();
        }
        
        // Return the nth "count and say" sequence
        return s;
    }
}
