class Solution {
    public int arrangeCoins(int n) {
        // Using the quadratic formula: k = (-1 + sqrt(1 + 8n)) / 2
        return (int) ((Math.sqrt(1 + 8L * n) - 1) / 2);
    }
}