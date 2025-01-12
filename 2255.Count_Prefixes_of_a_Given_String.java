class Solution {
    public int countPrefixes(String[] words, String s) {
        int count =0;

        // Iterate through each word in the array 'words'
        for(int i=0; i<words.length; i++){
            if(s.startsWith(words[i])){
                count++;
            }
        }
        return count;
    }
}