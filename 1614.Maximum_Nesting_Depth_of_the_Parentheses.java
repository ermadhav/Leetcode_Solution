class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int maxDepth = 0;  // Track the maximum nesting depth
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
                maxDepth = Math.max(maxDepth, count); // Update max depth
            } else if (s.charAt(i) == ')') {
                count--;
            }
        }
        return maxDepth;
    }
}
