import java.util.Stack;
class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] result = new int[n]; // Array to store the final prices
        Stack<Integer> stack = new Stack<>(); // Monotonic stack to track indices of prices
        // Iterate through each price in the array
        for (int i = 0; i < n; i++) {
            // Check if the stack is not empty and the current price is less than or equal 
            // to the price at the index stored in the stack (finding the next smaller/equal element)
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int index = stack.pop(); // Get the index from the stack
                result[index] = prices[index] - prices[i]; // Apply the discount
            }
            stack.push(i); // Push the current index onto the stack
        }
        
        // Fill the remaining indices in result (which had no discounts)
        while (!stack.isEmpty()) {
            int index = stack.pop();
            result[index] = prices[index]; // No discount available, keep original price
        }

        return result; // Return the final prices array
    }
}
