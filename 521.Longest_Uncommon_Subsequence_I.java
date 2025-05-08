class Solution {
    // If the strings are equal, there's no uncommon subsequence
    public int findLUSlength(String a, String b) {
        if(a.equals(b)){
            return -1;
        }
        // If they're not equal, the longer string itself is the LUS
        return Math.max(a.length(), b.length());
    }
}