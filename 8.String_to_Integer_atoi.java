class Solution {
    public int myAtoi(String s) {
        
        int i = 0, n = s.length(), sign = 1, result = 0;

        // Step 1: Ignore leading whitespaces
        while (i < n && s.charAt(i) == ' ') i++;

        // Step 2: Check if the next character is '+' or '-'
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) 
            sign = (s.charAt(i++) == '-') ? -1 : 1;

        // Step 3: Convert digits into an integer
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i++) - '0';

            // Step 4: Handle overflow and underflow
            if (result > (Integer.MAX_VALUE - digit) / 10) 
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            result = result * 10 + digit;
        }

        // Step 5: Apply sign and return the result
        return result * sign;
    }
}