class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j = 0; // index for popped array

        for (int x : pushed) {
            stack.push(x);   // push element

            // pop while top matches popped[j]
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }

        // if stack is empty, sequence is valid
        return stack.isEmpty();
    }
}