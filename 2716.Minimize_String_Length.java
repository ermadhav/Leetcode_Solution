import java.util.Hashtable; // ✅ Import Hashtable class

class Solution {
    public int minimizedStringLength(String s) {
        // Create a hashtable to store character frequencies
        Hashtable<Character, Integer> table = new Hashtable<>();

        // Count frequency of each character in the string
        for (char c : s.toCharArray()) {
            table.put(c, table.getOrDefault(c, 0) + 1);
        }

        // The minimized string will only contain one of each unique character
        return table.size(); // Return the number of unique characters
    }
}
