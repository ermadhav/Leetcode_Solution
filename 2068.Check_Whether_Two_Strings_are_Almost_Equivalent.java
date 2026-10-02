class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        // store frequency of each letter in both words
        int[] a = new int[26];
        int[] b = new int[26];
        // count letters of word1
        for(char ch: word1.toCharArray()){
            a[ch-'a']++;
        }
        // count letters of word2
        for(char ch: word2.toCharArray()){
            b[ch-'a']++;
        }
        // check frequency diff for each letter
        for(int i=0; i<26;i++){
            if(Math.abs(a[i]-b[i])>3){
                return false;
            }
        }
        return true;
    }
}