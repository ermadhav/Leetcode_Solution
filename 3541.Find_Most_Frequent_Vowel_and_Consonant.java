class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26]; // to store frequency of each letter

        // count frequency of each character in string
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int maxVowel = 0, maxConsonant = 0;

        // check all letters
        for (int i = 0; i < 26; i++) {
            char c = (char) (i + 'a');
            if ("aeiou".indexOf(c) != -1) {
                maxVowel = Math.max(maxVowel, freq[i]);       // update max vowel
            } else {
                maxConsonant = Math.max(maxConsonant, freq[i]); // update max consonant
            }
        }

        // return sum of max vowel and max consonant frequency
        return maxVowel + maxConsonant;
    }
}
