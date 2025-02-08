class Solution {
    public String removeStars(String s) {
        StringBuilder stack = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                stack.deleteCharAt(stack.length() - 1); // Remove the last character
            } else {
                stack.append(ch); // Add character to stack
            }
        }
        return stack.toString();
    }
}
