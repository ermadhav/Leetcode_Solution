import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
    
        // Method to find all words from queries that are within 2 edits of any word in the dictionary
     List<String> result = new ArrayList<>();
        for (String query : queries) {
            for (String word : dictionary) {
                // Check if the difference between query and word is at most 2
                if (countDifferences(query, word) <= 2) {
                    result.add(query);// Add query to result if condition is met
                    break;// Stop checking further for this query
                }
            }
        }
        return result;
    }
     // Helper method to count character differences between two strings
    private static int countDifferences(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i) && ++count > 2) return count;// Stop early if differences exceed 2
        }
        return count;
    }
}
    