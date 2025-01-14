class Solution {
    public int possibleStringCount(String word) {
        int n = word.length();
        if (n == 1) return 1; // Single character, it could have been intended to type or typed twice

        int count = 1; // The original string is one valid possibility
        for (int i = 0; i < n - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }
}
