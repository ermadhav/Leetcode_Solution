import java.util.Stack;

class Solution {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            stack.push(c); // Push the current character onto the stack

            // Check if the last two characters form "AB" or "CD"
            if (stack.size() >= 2) {
                char secondLast = stack.get(stack.size() - 2);
                char last = stack.peek();
                
                // If the last two characters are "AB" or "CD", pop them
                if ((secondLast == 'A' && last == 'B') || (secondLast == 'C' && last == 'D')) {
                    stack.pop(); // Remove last character
                    stack.pop(); // Remove second last character
                }
            }
        }

        // The size of the stack is the length of the resulting string
        return stack.size();
    }
}
