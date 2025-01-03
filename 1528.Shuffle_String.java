class Solution {
    public String restoreString(String s, int[] indices) {

        char[] shuffledString = new char[s.length()]; // Created a new array to store the suffled array

        // This for loop place the character in correct place
        for (int i=0; i < s.length(); i++){
            shuffledString[indices[i]] = s.charAt(i);
        }

        return new String(shuffledString);

    }
}