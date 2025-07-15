class Solution {
    public boolean isValid(String word) {
        // Must be at least 3 characters
        if (word.length() < 3) return false;

        boolean hasVowel = false, hasConsonant = false;

        for (char c : word.toCharArray()) {
            // Only allow letters and digits
            if (!Character.isLetterOrDigit(c)) return false;

            if (isVowel(c)) hasVowel = true;
            else if (Character.isLetter(c)) hasConsonant = true;
        }

        // Must have at least one vowel and one consonant
        return hasVowel && hasConsonant;
    }

    // Checks for vowels (both cases)
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
