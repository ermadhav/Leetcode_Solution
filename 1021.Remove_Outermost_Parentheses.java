class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int depth = 0; // Track depth of parentheses

        for (int i = 0; i < s.length(); i++) { // Fix: Use s.length() instead of res.length()
            if (s.charAt(i) == '(') {
                if (depth > 0) { // Ignore outermost '('
                    res.append(s.charAt(i));
                }
                depth++;
            } else { // s.charAt(i) == ')'
                depth--;
                if (depth > 0) { // Ignore outermost ')'
                    res.append(s.charAt(i));
                }
            }
        }
        return res.toString();
    }
}
