class Solution {
    public int numSub(String s) {
        long mod = 1_000_000_007, count = 0, ans = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;            // extend current run of 1's
                ans = (ans + count) % mod;   // add all new substrings ending here
            } else {
                count = 0;          // reset when hitting 0
            }
        }
        return (int) ans;            // return result mod 1e9+7
    }
}
