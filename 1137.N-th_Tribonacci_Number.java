class Solution {
    public int tribonacci(int n) {
        if (n == 0) return 0;        // T0 = 0
        if (n == 1 || n == 2) return 1; // T1 = T2 = 1
        int a = 0, b = 1, c = 1;     // Initialize first three terms
        for (int i = 3; i <= n; i++) {
            int next = a + b + c;    // Sum of previous three
            a = b; b = c; c = next;  // Shift values
        }
        return c;                    // Return nth term
    }
}
