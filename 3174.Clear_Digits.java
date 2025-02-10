class Solution {
    public String clearDigits(String s) {
        // Use StringBuilder to efficiently modify the string
        StringBuilder stack = new StringBuilder();
        
        // Loop through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // Get the current character
            
            if (Character.isDigit(c)) { 
                // If the character is a digit, remove the last character from stack
                // This simulates a "backspace" effect
                if (stack.length() > 0) { // Ensure stack is not empty to avoid error
                    stack.deleteCharAt(stack.length() - 1);
                }
            } else {
                // If it's not a digit, add the character to the stack
                stack.append(c);
            }
        }
        // Convert StringBuilder to a string and return the final result
        return stack.toString();
    }
}
