import java.util.Stack;

class MinStack {

    private Stack<Integer> stack;    // Main stack to store all elements
    private Stack<Integer> minStack; // Auxiliary stack to keep track of minimum values

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Pushes an element onto the stack
    public void push(int val) {
        stack.push(val); // Push the value onto the main stack

        // If minStack is empty or val is the new minimum, push it onto minStack
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        } else {
            // Otherwise, push the current minimum again to maintain alignment
            minStack.push(minStack.peek());
        }
    }

    // Removes the top element from the stack
    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();   // Remove the top element from the main stack
            minStack.pop(); // Remove the top element from the minStack as well
        }
    }

    // Returns the top element of the stack
    public int top() {
        return stack.peek();
    }

    // Retrieves the minimum element in the stack
    public int getMin() {
        return minStack.peek();
    }
}