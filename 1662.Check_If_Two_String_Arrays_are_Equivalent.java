class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        // Combining All Strings in word1 and word2

        String newWord1 = String.join("", word1);
        String newWord2 = String.join("", word2);

        // Comparing both combined Strings and returning the true if they are equal
        if(newWord1.compareTo(newWord2) == 0){
            return true;
        }
        return false;
    }
}