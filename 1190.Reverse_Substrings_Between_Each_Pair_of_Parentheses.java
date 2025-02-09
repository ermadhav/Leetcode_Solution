import java.util.Stack;

class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder current = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(current); // Save current string before '('
                current = new StringBuilder(); // Start a new string for inside parentheses
            } else if (ch == ')') {
                StringBuilder reversed = current.reverse(); // Reverse the inside part
                current = stack.pop().append(reversed); // Append to the previous part
            } else {
                current.append(ch); // Add characters normally
            }
        }
        return current.toString(); // Final result
    }
}
