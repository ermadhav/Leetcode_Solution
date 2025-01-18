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
                    result.add(query);
                    break;
                }
            }
        }
        return result;
    }

    private static int countDifferences(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i) && ++count > 2) return count;
        }
        return count;
    }
}
    