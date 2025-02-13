import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Base index for valid substring
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(i); // Store index of '('
            } else {
                stack.pop(); // Pop to match '('

                if (stack.isEmpty()) {
                    stack.push(i); // Reset base index
                } else {
                    maxLen = Math.max(maxLen, i - stack.peek()); // Update max length
                }
            }
        }
        return maxLen;
    }
}
