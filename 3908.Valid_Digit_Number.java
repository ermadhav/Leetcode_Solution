class Solution {
    public boolean validDigit(int n, int x) {
        String s = String.valueOf(n);
        String v = String.valueOf(x);
        if(s.charAt(0) != v.charAt(0) && s.contains(v)) return true;
        return false;
    }
}