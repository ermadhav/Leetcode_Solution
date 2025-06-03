public class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1]; // Result array

        for (int i = 1; i <= n; i++) {
            // ans[i >> 1] is the count for i/2, and (i & 1) adds 1 if i is odd
            ans[i] = ans[i >> 1] + (i & 1);
        }

        return ans;
    }
}
