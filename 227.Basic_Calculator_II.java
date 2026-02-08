class Solution {
    public int calculate(String s) {

        // Stack to store intermediate results
        Stack<Integer> stack = new Stack<>();

        int num = 0;      // Current number being built
        char sign = '+'; // Previous operator

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Build the number if digit is found
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            // If operator or end of string is reached
            if ((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {

                // Perform operation based on previous sign
                if (sign == '+') {
                    stack.push(num);
                } else if (sign == '-') {
                    stack.push(-num);
                } else if (sign == '*') {
                    stack.push(stack.pop() * num);
                } else if (sign == '/') {
                    stack.push(stack.pop() / num);
                }

                // Update sign and reset number
                sign = ch;
                num = 0;
            }
        }

        int res = 0;

        // Sum all values in stack
        while (!stack.isEmpty()) {
            res += stack.pop();
        }

        return res; // Final result
    }
}
