class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); // sort greed
        Arrays.sort(s); // sort cookies
        int i = 0, j = 0; // pointers for children & cookies
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) i++; // assign cookie if it fits
            j++; // move to next cookie
        }
        return i; // number of satisfied children
    }
}
