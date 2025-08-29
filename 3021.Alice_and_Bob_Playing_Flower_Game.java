class Solution {
    public long flowerGame(int n, int m) {
        // Count odds and evens in [1..n]
        long oddN = (n + 1) / 2, evenN = n / 2;
        // Count odds and evens in [1..m]
        long oddM = (m + 1) / 2, evenM = m / 2;

        // Alice wins if x+y is odd → (odd,even) or (even,odd)
        return oddN * evenM + evenN * oddM;
    }
}
