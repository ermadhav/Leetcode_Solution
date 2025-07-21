class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        boolean num = false, dot = false, exp = false, numAfterExp = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = true;
                if (exp) numAfterExp = true;
            } else if (c == '+' || c == '-') {
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') return false;
            } else if (c == '.') {
                if (dot || exp) return false;
                dot = true;
            } else if (c == 'e' || c == 'E') {
                if (exp || !num) return false;
                exp = true;
                numAfterExp = false;
            } else {
                return false;
            }
        }

        return num && numAfterExp;
    }
}