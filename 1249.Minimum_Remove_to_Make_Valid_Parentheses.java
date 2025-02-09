class Solution {
    public String minRemoveToMakeValid(String s) {
        // Use StringBuilder for efficient string manipulation
        StringBuilder sb = new StringBuilder(s);
        
        // Stack to store the indices of unmatched opening parentheses '('
        Stack<Integer> st = new Stack<>();

        // First pass: Identify unmatched parentheses
        for (int i = 0; i < sb.length(); ++i) {
            // If we find an opening parenthesis '(', push its index onto the stack
            if (sb.charAt(i) == '(') {
                st.add(i);
            }
            // If we find a closing parenthesis ')'
            if (sb.charAt(i) == ')') {
                // If there's a matching '(', pop from stack (valid pair)
                if (!st.empty()) {
                    st.pop();
                } 
                // If stack is empty, it means this ')' is unmatched → mark it as '*'
                else {
                    sb.setCharAt(i, '*');
                }
            }
        }

        // Second pass: Remove any unmatched '(' left in the stack
        while (!st.empty()) {
            sb.setCharAt(st.pop(), '*'); // Mark invalid '(' as '*'
        }

        // Remove all marked '*' characters and return the valid string
        return sb.toString().replaceAll("\\*", "");
    }
}
