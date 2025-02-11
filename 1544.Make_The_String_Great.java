import java.util.Stack;

public class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>(); // Stack to store characters
        
        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // Check if the stack is not empty and the top character forms a bad pair with the current character
            if (!stack.isEmpty() && Math.abs(stack.peek() - c) == 32) 
                stack.pop(); // Remove the last character if it forms a bad pair
            else 
                stack.push(c); // Otherwise, add the current character to the stack
        }
        
        // Build the final string from the remaining characters in the stack
        StringBuilder result = new StringBuilder();
        for (char c : stack) result.append(c);
        
        return result.toString(); // Return the modified string
    }
}
