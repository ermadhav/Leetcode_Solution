public class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(); // Using StringBuilder as a stack
        for (char c : s.toCharArray()) {
            // Check if the last character in sb and current character form a bad pair
            if (sb.length() > 0 && Math.abs(sb.charAt(sb.length() - 1) - c) == 32) 
                sb.setLength(sb.length() - 1); // Remove the last character if it forms a bad pair
            else 
                sb.append(c); // Otherwise, add the current character to sb
        }
        return sb.toString(); // Return the modified string
    }
}
