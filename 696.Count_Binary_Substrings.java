class Solution {
    public int countBinarySubstrings(String s) {
        int n = s.length();
        int i = 0;
        int ans = 0;

        while (i < n) {
            int count1 = 0;
            char c = s.charAt(i);

            // count consecutive same characters (first group)
            while (i < n && s.charAt(i) == c) {
                count1++;
                i++;
            }

            int count2 = 0;

            // count next group of consecutive characters
            if (i < n) {
                char d = s.charAt(i);
                while (i < n && s.charAt(i) == d) {
                    count2++;
                    i++;
                }
            }

            // add minimum of both group sizes
            ans += Math.min(count1, count2);

            // move back to start of second group
            i = i - count2;
        }

        return ans;
    }
}
