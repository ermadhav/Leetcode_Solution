class Solution {
    public String mergeAlternately(String word1, String word2) {
        // Use StringBuilder to build the result
        StringBuilder ans = new StringBuilder();

        int i = 0, j = 0;
        int len1 = word1.length();
        int len2 = word2.length();

        // Keep adding letters until both words are done
        while (i < len1 || j < len2) {
            if (i < len1) {
                ans.append(word1.charAt(i)); // add letter from word1
                i++;
            }
            if (j < len2) {
                ans.append(word2.charAt(j)); // add letter from word2
                j++;
            }
        }

        return ans.toString(); // return the final merged string
    }
}
