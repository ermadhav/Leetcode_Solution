import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q = new LinkedList<>(); // Single queue used to simulate stack

    public MyStack() {
        // Constructor (no initialization needed)
    }

    public void push(int x) {
        q.add(x); // Add element to the back of the queue
    }

    public int pop() {
        // Rotate queue to move last added element to front
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
        return q.remove(); // Remove and return the top element
    }

    public int top() {
        // Rotate queue to access last added element
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
        int val = q.peek(); // Get the top element
        q.add(q.remove());  // Restore queue state
        return val;
    }

    public boolean empty() {
        return q.size() == 0; // Return true if stack is empty
    }
}
