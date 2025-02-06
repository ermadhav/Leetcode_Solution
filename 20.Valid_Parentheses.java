import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // If the character is an opening bracket, push it onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // If it's a closing bracket, check the stack
                if (stack.isEmpty()) {
                    return false;  // Stack is empty, no opening bracket for this closing bracket
                }
                char top = stack.pop();
                if (c == ')' && top != '(' || c == '}' && top != '{' || c == ']' && top != '[') {
                    return false;  // Mismatched bracket
                }
            }
        }
        
        // If the stack is empty, all brackets matched properly
        return stack.isEmpty();
    }
}
