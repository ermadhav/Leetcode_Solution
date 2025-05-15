import java.util.Stack;

class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder();         // Builds the final string
        Stack<Integer> countStack = new Stack<>();      // Stores the count of repeated characters

        for (char c : s.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
                // If current char == last added char in StringBuilder
                int count = countStack.pop() + 1;        // Increment count
                if (count == k) {
                    // If count reaches k, remove k characters
                    sb.delete(sb.length() - k + 1, sb.length());
                } else {
                    sb.append(c);                        // Otherwise, just append the char
                    countStack.push(count);              // Update count in stack
                }
            } else {
                // New character — append it and set count to 1
                sb.append(c);
                countStack.push(1);
            }
        }

        return sb.toString();   // Return final result
    }
}