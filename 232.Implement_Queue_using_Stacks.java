class MyQueue {
    Stack<Integer> st = new Stack<>();      // Main stack
    Stack<Integer> helper = new Stack<>();  // Helper stack for reversal

    public MyQueue() {
        // Constructor (no initialization required)
    }

    public void push(int x) {
        st.push(x); // Push element to the main stack
    }

    public int pop() {
        // Move elements to helper stack to access the bottom (front) element
        while (st.size() > 1) {
            helper.push(st.pop());
        }
        int x = st.pop(); // Pop the front element of the queue
        // Restore elements back to main stack
        while (helper.size() > 0) {
            st.push(helper.pop());
        }
        return x;
    }

    public int peek() {
        // Move elements to helper to access the front element
        while (st.size() > 1) {
            helper.push(st.pop());
        }
        int x = st.peek(); // Peek the front element without removing
        // Restore elements back to main stack
        while (helper.size() > 0) {
            st.push(helper.pop());
        }
        return x;
    }

    public boolean empty() {
        return st.size() == 0; // Queue is empty if main stack is empty
    }
}
