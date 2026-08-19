class Solution {
    public boolean closeStrings(String word1, String word2) {

        // strings must have the same length
        if(word1.length() != word2.length()){
            return false;
        }
        // Store frequency of each char in both strings
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // count char of word1
        for(char ch: word1.toCharArray()){
            freq1[ch - 'a']++;
        }

        // count char of word2
        for(char ch: word2.toCharArray()){
            freq2[ch - 'a']++;
        }

        // Dono String me same set of char hone chahiye
        // agar char ek string me hai but dusre me nahi to, return false
        for(int i=0; i<26; i++){
            if((freq1[i] == 0) != (freq2[i] == 0)){
                return false;
            }
        }

        // freq sort taki   patter ko compare kar sake
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        // if feq equal they are equal
        return Arrays.equals(freq1, freq2);
    }
}