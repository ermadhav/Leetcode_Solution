class Solution {
    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder(); // Used to build and reduce the string
        for (char c : s.toCharArray()) {
            sb.append(c); // Add current character to the end
            // Check if the last 3 characters are "abc"
            if (sb.length() >= 3 &&
                sb.substring(sb.length() - 3).equals("abc")) {
                // If yes, remove them
                sb.delete(sb.length() - 3, sb.length());
            }
        }
        // If all valid "abc" patterns removed, result should be empty
        return sb.length() == 0;
    }
}