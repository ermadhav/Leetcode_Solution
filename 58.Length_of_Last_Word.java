class Solution {
    public int lengthOfLastWord(String s) {

        //Spliting the String
        String[] newString = s.split(" ");

        // String the Length of newString in l
        int l = newString.length;

        // Storing the Last Word in a
        String a = newString[l-1];

        
        int ans = a.length();

        return ans;
        
    }
}