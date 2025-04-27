import java.util.*;

public class Solution {
    public String arrangeWords(String text) {
        // Convert the first letter to lowercase and split the text into words
        String[] words = text.toLowerCase().split(" ");

        // Sort words based on their lengths (shortest to longest)
        Arrays.sort(words, Comparator.comparingInt(String::length));

        // Join the sorted words back into a single string with spaces
        String result = String.join(" ", words);

        // Capitalize the first letter of the final result and return it
        return Character.toUpperCase(result.charAt(0)) + result.substring(1);
    }
}
