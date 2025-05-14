class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);  // Find the index of the first occurrence of ch
        if (index == -1) {
            return word;  // If ch is not found, return the word as is
        }

        // Reverse the substring from 0 to index (inclusive)
        StringBuilder sb = new StringBuilder(word.substring(0, index + 1));
        sb.reverse();
        sb.append(word.substring(index + 1));  // Append the rest of the word

        return sb.toString();
    }
}