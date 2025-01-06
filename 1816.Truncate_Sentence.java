class Solution {
    public String truncateSentence(String s, int k) {
        // Convert the input Sring into Char Array
        char[] newStr = s.toCharArray();

        // Split the input string `s` into an array of word
        String[] words = s.split(" ");

        StringBuilder arr = new StringBuilder();

        for (int i=0; i<k && i<words.length; i++){
            arr.append(words[i]).append(" "); // Append the word followed by a space
        }

        // Trim any trailing spaces and return
        return arr.toString().trim();
    }
}