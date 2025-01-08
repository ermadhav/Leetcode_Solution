class Solution {
    public int lengthOfLastWord(String s) {
        String[] newString = s.split(" ");
        int l = newString.length;
        String a = newString[l-1];
        int ans = a.length();

        return ans;
        
    }
}