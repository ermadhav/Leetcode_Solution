class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] a = new int[26];
        int[] b = new int[26];
        // count char of word1
        for(char ch: word1.toCharArray()){
            a[ch-'a']++;
        }
        // count char of word2
        for(char ch: word2.toCharArray()){
            b[ch-'a']++;
        }
        // subtract char from word2
        for(int i=0; i<26;i++){
            if(Math.abs(a[i]-b[i])>3){
                return false;
            }
        }
        return true;
    }
}