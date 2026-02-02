class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int left = 0, zeros = 0, ones = 0, ans = 0;

        for (int right = 0; right < s.length(); right++) {
            // include current character in window
            if (s.charAt(right) == '0') zeros++;
            else ones++;

            // shrink window if it becomes invalid (both > k)
            while (zeros > k && ones > k) {
                if (s.charAt(left++) == '0') zeros--;
                else ones--;
            }

            // all substrings ending at right are valid
            ans += right - left + 1;
        }

        return ans; // total valid substrings
    }
}
