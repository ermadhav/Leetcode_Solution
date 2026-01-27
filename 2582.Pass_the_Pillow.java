class Solution {
    public int passThePillow(int n, int time) {
        int cycle = 2 * (n - 1);
        int t = time % cycle;

        if (t < n) {
            return 1 + t;   // moving forward
        } else {
            return n - (t - (n - 1)); // moving backward
        }
    }
}
