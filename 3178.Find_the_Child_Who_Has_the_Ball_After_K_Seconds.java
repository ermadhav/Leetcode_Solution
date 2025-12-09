class Solution {
    public int passTheBall(int n, int k) {
        int cycle = 2 * (n - 1);      // Full back-and-forth cycle length
        int pos = k % cycle;          // Effective steps after removing full cycles

        if (pos <= n - 1) {
            return pos;               // Going right
        } else {
            return 2 * (n - 1) - pos; // Coming back left
        }
    }
}
