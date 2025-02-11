import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");  // Split by "/"

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                continue;  // Ignore empty and current directory
            }
            if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();  // Go back to the previous directory
                }
            } else {
                stack.push(part);  // Valid directory name
            }
        }
        // Build the canonical path
        return "/" + String.join("/", stack);
    }
}