class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int n = s.length();
        int count = 0;

        for (int i = 0; i <= n - k; i++) {
            String sub = s.substring(i, i + k);
            int val = Integer.parseInt(sub);

            // Skip if substring is "0" or evaluates to 0 (cannot divide)
            if (val != 0 && num % val == 0) {
                count++;
            }
        }

        return count;
    }
}
