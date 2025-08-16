class Solution {
    // Store computed arrays to avoid recalculation
    private Map<Integer, int[]> memo = new HashMap<>();

    public int[] beautifulArray(int n) {
        return build(n);
    }

    private int[] build(int n) {
        // Return memoized result if available
        if (memo.containsKey(n))
            return memo.get(n);

        int[] res = new int[n];
        if (n == 1) {
            res[0] = 1; // Base case
        } else {
            // Build odd part
            int[] odd = build((n + 1) / 2);
            for (int i = 0; i < odd.length; i++)
                res[i] = 2 * odd[i] - 1;

            // Build even part
            int[] even = build(n / 2);
            for (int i = 0; i < even.length; i++)
                res[odd.length + i] = 2 * even[i];
        }

        memo.put(n, res); // Save result
        return res;
    }
}
