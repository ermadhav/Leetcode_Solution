class Solution {
    public int[] closestDivisors(int num) {
        int a = num+1;
        int b = num+2;
        // Start from sqrt(b) and go down to 1 to find closest factors
        for (int i = (int)Math.sqrt(b); i >= 1; i--) {
            // If i divides a, return the factor pair (i, a/i)
            if (a % i == 0) return new int[]{i, a / i};
            // If i divides b, return the factor pair (i, b/i)
            if (b % i == 0) return new int[]{i, b / i};
        }
        // Fallback return, though we’ll always find a valid pair before this
        return null;
    }
}