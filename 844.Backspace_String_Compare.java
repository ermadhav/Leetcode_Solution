class Solution {
    public static boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t)); // Compare final processed forms
    }

    // Simulate typing with backspace using a stack
    private static String build(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c != '#') stack.push(c);       // Add normal character
            else if (!stack.isEmpty()) stack.pop(); // Remove last character
        }

        // Convert stack to string
        StringBuilder sb = new StringBuilder();
        for (char c : stack) sb.append(c);
        return sb.toString();
    }
}