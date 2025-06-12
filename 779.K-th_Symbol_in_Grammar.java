class Solution {
    // Returns the k-th symbol in the n-th row
    public int kthGrammar(int n, int k) {
        return kthSymbol(n, k);
    }

    // Recursive helper to find symbol
    private int kthSymbol(int n, int k) {
        if (n == 1) return 0;               // Base case: first row is 0
        int parent = kthSymbol(n - 1, (k + 1) / 2); // Find parent's symbol
        if (k % 2 == 1) return parent;     // Odd index: same as parent
        else return 1 - parent;             // Even index: flipped symbol
    }
}
