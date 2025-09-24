class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        // If numerator is 0, result is 0
        if (numerator == 0) return "0";
        
        StringBuilder result = new StringBuilder();
        
        // Handle negative result
        if ((numerator < 0) ^ (denominator < 0)) result.append("-");
        
        // Convert to long to avoid overflow
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        
        // Append the integer part
        result.append(num / den);
        long remainder = num % den;
        
        // If no remainder, return the result
        if (remainder == 0) return result.toString();
        
        // There is a fractional part
        result.append(".");
        
        // Map to store remainder → position in result
        java.util.Map<Long, Integer> map = new java.util.HashMap<>();
        
        // Process fractional part
        while (remainder != 0) {
            // If remainder already seen, repeating cycle detected
            if (map.containsKey(remainder)) {
                int pos = map.get(remainder);
                result.insert(pos, "("); // insert "(" at cycle start
                result.append(")");      // append ")" at the end
                break;
            }
            
            // Store remainder position
            map.put(remainder, result.length());
            
            // Multiply remainder by 10 and divide
            remainder *= 10;
            result.append(remainder / den);
            remainder %= den;
        }
        
        return result.toString();
    }
}
