class Solution {
    public int clumsy(int n) {
        // Stack to handle operator precedence
        Stack<Integer> stack = new Stack<>();
        stack.push(n--);  // Push the first number
        int op = 0;       // Operation index: 0 -> *, 1 -> /, 2 -> +, 3 -> -

        while (n > 0) {
            if (op % 4 == 0) {
                // Multiplication
                stack.push(stack.pop() * n);
            } else if (op % 4 == 1) {
                // Floor Division
                stack.push(stack.pop() / n);
            } else if (op % 4 == 2) {
                // Addition: push as is
                stack.push(n);
            } else {
                // Subtraction: push negative number
                stack.push(-n);
            }
            n--;    // Move to the next number
            op++;   // Move to the next operation
        }

        // Sum all values in the stack to get the final result
        int result = 0;
        for (int num : stack) result += num;
        return result;
    }
}
