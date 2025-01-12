class Solution {
    public int countPrefixes(String[] words, String s) {
        int count =0;

        // Iterate through each word in the array 'words'
        for(int i=0; i<words.length; i++){

             // Check if the string 's' starts with the current word
            if(s.startsWith(words[i])){

                // If true, increment in the count
                count++;
            }
        }
        return count;
    }
}