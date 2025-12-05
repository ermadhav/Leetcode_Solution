class Solution {
    public int numWays(String s) {
        long mod = 1_000_000_007;
        int n = s.length(), ones = 0;

        // count total 1s
        for (char c : s.toCharArray()) if (c == '1') ones++;

        // if not divisible by 3 → no split
        if (ones % 3 != 0) return 0;

        // if zero 1s → choose any 2 split points
        if (ones == 0) return (int)((long)(n - 1) * (n - 2) / 2 % mod);

        int k = ones / 3, cnt = 0;
        long a = 0, b = 0;

        // count gaps after k-th and 2k-th '1'
        for (char c : s.toCharArray()) {
            if (c == '1') cnt++;
            else {
                if (cnt == k) a++;     // gap after 1st segment
                if (cnt == 2 * k) b++; // gap after 2nd segment
            }
        }

        // ways = (choices after part1) * (choices after part2)
        return (int)((a + 1) * (b + 1) % mod);
    }
}
