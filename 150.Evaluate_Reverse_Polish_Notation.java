class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>(); // Stack to store operands
        for (String token : tokens) {
            // If the token is an operator, pop two operands and apply the operation
            if ("+-*/".contains(token)) {
                int b = stack.pop(); // Second operand
                int a = stack.pop(); // First operand
                // Perform the operation based on the operator
                switch (token) {
                    case "+": stack.push(a + b); break; // Addition
                    case "-": stack.push(a - b); break; // Subtraction
                    case "*": stack.push(a * b); break; // Multiplication
                    case "/": stack.push(a / b); break; // Integer division (truncates towards zero)
                }
            } else {
                // If the token is a number, push it onto the stack
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop(); // The final result is the last element in the stack
    }
}
