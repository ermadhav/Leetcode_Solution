public class ScoreOfParentheses {
    public static int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0); // Initialize stack with 0 to hold the final score
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(0); // Push 0 to mark a new score block
            } else {
                int top = stack.pop(); // Pop the last score
                int score = Math.max(2 * top, 1); // If top is 0, assign 1, otherwise double it
                stack.push(stack.pop() + score); // Add score to the previous level
            }
        }
        
        return stack.pop(); // The last element in the stack is the final score
    }

    public static void main(String[] args) {
        // Test cases to validate the function
        System.out.println(scoreOfParentheses("()"));         // Output: 1
        System.out.println(scoreOfParentheses("(())"));       // Output: 2
        System.out.println(scoreOfParentheses("()()"));       // Output: 2
        System.out.println(scoreOfParentheses("(()(()))"));   // Output: 6
    }
}