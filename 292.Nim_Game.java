class Solution {
    public boolean canWinNim(int n) {
        // If n is a multiple of 4, you will lose.
        if(n % 4 == 0) return false;

        // Otherwise, you can win.
        return true;
    }
}
