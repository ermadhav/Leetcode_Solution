import java.util.Stack;
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String op : operations) {
            if (op.equals("+")) {
                // Sum of the last two scores
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);  // Put back the top element
                stack.push(newTop);
            } else if (op.equals("D")) {
                // Double the last score
                stack.push(2 * stack.peek());
            } else if (op.equals("C")) {
                // Invalidate the last score
                stack.pop();
            } else {
                // Push an integer score
                stack.push(Integer.parseInt(op));
            }
        }
        // Sum up all scores
        int sum = 0;
        for (int score : stack) {
            sum += score;
        }
        return sum;
    }
}
