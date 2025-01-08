class Solution {
    public int lengthOfLastWord(String s) {

        //Spliting the String
        String[] newString = s.split(" ");
        int l = newString.length;
        String a = newString[l-1];
        int ans = a.length();

        return ans;
        
    }
}