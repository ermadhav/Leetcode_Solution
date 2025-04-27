import java.util.*;

class Solution {
    public String sortVowels(String s) {
        // List to store vowels found in the string
        List<Character> vowels = new ArrayList<>();
        
        // Step 1: Collect all vowels from the string
        for (char c : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) >= 0) {  // Check if the character is a vowel
                vowels.add(c);
            }
        }
        
        // Step 2: Sort the vowels in ascending order by their ASCII values
        Collections.sort(vowels);
        
        // Step 3: Build the result string
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            // If the character is a vowel, replace it with the next sorted vowel
            result.append("aeiouAEIOU".indexOf(c) >= 0 ? vowels.remove(0) : c);
        }
        
        return result.toString();  // Return the final string with vowels sorted
    }
}
