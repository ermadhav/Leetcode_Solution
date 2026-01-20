class Solution {
    public int rearrangeCharacters(String s, String target) {
        // Frequency of characters in s
        int[] a = new int[26];
        // Frequency of characters in target
        int[] b = new int[26];

        // Count characters in s
        for (char c : s.toCharArray()) {
            a[c - 'a']++;
        }

        // Count characters in target
        for (char c : target.toCharArray()) {
            b[c - 'a']++;
        }

        // Store minimum possible copies of target
        int ans = Integer.MAX_VALUE;

        // Find limiting character
        for (int i = 0; i < 26; i++) {
            if (b[i] > 0) {
                ans = Math.min(ans, a[i] / b[i]);
            }
        }

        // Maximum times target can be formed
        return ans;
    }
}
