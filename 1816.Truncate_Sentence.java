class Solution {
    public String truncateSentence(String s, int k) {
        char[] newStr = s.toCharArray();
        String[] words = s.split(" ");

        StringBuilder arr = new StringBuilder();

        for (int i=0; i<k && i<words.length; i++){
            arr.append(words[i]).append(" ");
        }
        return arr.toString().trim();
    }
}