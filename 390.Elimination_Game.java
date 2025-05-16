class Solution {
    public int lastRemaining(int n) {
        return helper(n, true);
    }

    private int helper(int n, boolean leftToRight) {
        // Base case: only one element remains
        if (n == 1) {
            return 1;
        }

        // Recursive step:
        // - If we are going left-to-right, or n is odd: always eliminate the first element.
        // - If we are going right-to-left and n is even: the first element stays.
        if (leftToRight || n % 2 == 1) {
            return 2 * helper(n / 2, !leftToRight);
        } else {
            return 2 * helper(n / 2, !leftToRight) - 1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 9;
        System.out.println("Last remaining number: " + solution.lastRemaining(n));  // Output: 6
    }
}
