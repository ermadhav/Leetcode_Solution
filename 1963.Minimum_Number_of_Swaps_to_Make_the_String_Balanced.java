class Solution {
    public int minSwaps(String s) {
        int balance = 0;   // tracks current balance
        int maxUnbalanced = 0; // tracks max imbalance

        for (char c : s.toCharArray()) {
            if (c == '[') {
                balance++;  // opening bracket adds balance
            } else {
                balance--;  // closing bracket reduces balance
                if (balance < 0) {
                    maxUnbalanced = Math.max(maxUnbalanced, -balance);
                }
            }
        }

        // Each swap can fix 2 unbalanced brackets
        return (maxUnbalanced + 1) / 2;
    }
}