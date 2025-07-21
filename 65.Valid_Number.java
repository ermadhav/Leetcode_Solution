class Solution {
    public boolean isNumber(String s) {
        s = s.trim();  // Remove leading and trailing whitespaces

        // Flags to track digits, decimal point, exponent, and digits after exponent
        boolean num = false;
        boolean dot = false;
        boolean exp = false;
        boolean numAfterExp = true; // Will be set to false when 'e' is seen

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = true; // We've seen at least one digit
                if (exp) numAfterExp = true; // Valid digit after 'e'
            } else if (c == '+' || c == '-') {
                // Sign is valid only at the start or immediately after 'e' or 'E'
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') return false;
            } else if (c == '.') {
                // Decimal point is not allowed after 'e' or if already seen
                if (dot || exp) return false;
                dot = true;
            } else if (c == 'e' || c == 'E') {
                // 'e' must follow a number and can appear only once
                if (exp || !num) return false;
                exp = true;
                numAfterExp = false; // Expect digit(s) after 'e'
            } else {
                // Invalid character
                return false;
            }
        }

        // Valid only if there's at least one digit before and (if needed) after 'e'
        return num && numAfterExp;
    }
}