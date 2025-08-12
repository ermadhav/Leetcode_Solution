class Solution {
    public int countOdds(int low, int high) {
        // Count odds from 1 to high minus odds from 1 to (low - 1)
        return ((high + 1) / 2) - (low / 2);
    }
}
