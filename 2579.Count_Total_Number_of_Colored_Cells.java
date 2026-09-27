class Solution {
    public long coloredCells(int n) {
        // converting INT to LONG
        long x =n;
        // formula used to calculate colored cell
        return x*x+(x-1)*(x-1);
    }
}