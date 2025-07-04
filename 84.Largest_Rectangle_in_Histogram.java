import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        int n = heights.length;

        // Traverse through all bars of the histogram
        for (int i = 0; i < n; i++) {
            // Pop from stack while the current bar is smaller than the top of the stack
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                max = getMax(heights, stack, max, i);
            }
            // Push current index to stack
            stack.push(i);
        }

        // Process any remaining bars in the stack
        while (!stack.isEmpty()) {
            max = getMax(heights, stack, max, n);
        }

        return max;
    }

    // Helper function to calculate area and return the maximum
    private static int getMax(int[] arr, Stack<Integer> stack, int max, int i) {
        int area;
        int popped = stack.pop();
        // If stack is empty, width = i
        if (stack.isEmpty()) {
            area = arr[popped] * i;
        } else {
            // Width = distance between current index and index on top of the stack - 1
            area = arr[popped] * (i - 1 - stack.peek());
        }
        return Math.max(max, area);
    }
}
