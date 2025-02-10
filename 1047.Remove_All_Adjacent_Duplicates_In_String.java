class Solution {
    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) { // Fix: Iterate through all characters
            char c = s.charAt(i);
            
            // Check if stack is not empty and last character in stack is same as current character
            if (stack.length() > 0 && stack.charAt(stack.length() - 1) == c) {
                stack.deleteCharAt(stack.length() - 1); // Remove the last character
            } else {
                stack.append(c); // Add current character to stack
            }
        }
        return stack.toString();
    }
}
