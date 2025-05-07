class Solution {
    public boolean detectCapitalUse(String word) {
        // Case 1: All letters are uppercase
        if (word.equals(word.toUpperCase())) {
            return true;
        }

        // Case 2: All letters are lowercase
        if (word.equals(word.toLowerCase())) {
            return true;
        }

        // Case 3: Only the first letter is uppercase and the rest are lowercase
        String first = word.substring(0, 1);
        String rest = word.substring(1);
        if (first.equals(first.toUpperCase()) && rest.equals(rest.toLowerCase())) {
            return true;
        }

        // If none of the cases matched, return false
        return false;
    }
}
