import java.util.HashSet;
import java.util.Set;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        // Morse code representations for each letter in the English alphabet
        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        // A set to store unique transformations
        Set<String> transformations = new HashSet<>();

        // Iterate through each word in the array
        for (String word : words) {
            StringBuilder transformation = new StringBuilder();

            // Convert each character in the word to its Morse code equivalent
            for (char c : word.toCharArray()) {
                transformation.append(morseCode[c - 'a']);
            }

            // Add the transformation to the set
            transformations.add(transformation.toString());
        }

        // The size of the set represents the number of unique transformations
        return transformations.size();
    }
}
