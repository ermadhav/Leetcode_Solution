class Solution {
    public String baseNeg2(int n) {
        // If number is 0, just return "0"
        if (n == 0) return "0";

        StringBuilder sb = new StringBuilder();

        // Keep dividing until n becomes 0
        while (n != 0) {
            // Get the remainder (0 or 1)
            int remainder = n & 1; // same as n % 2 but safe for negatives

            // Append remainder to result (will reverse later)
            sb.append(remainder);

            // Update n: subtract remainder and divide by -2
            n = (n - remainder) / -2;
        }

        // Digits were collected in reverse order, so reverse them
        return sb.reverse().toString();
    }
}
