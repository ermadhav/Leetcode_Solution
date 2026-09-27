class Solution {
    public boolean validDigit(int n, int x) {
        // store the n in string form
        String s = String.valueOf(n);
        // store the v in string form
        String v = String.valueOf(x);
        // if first char is not X && N contains X then return true
        if(s.charAt(0) != v.charAt(0) && s.contains(v)) return true;
        return false;
    }
}