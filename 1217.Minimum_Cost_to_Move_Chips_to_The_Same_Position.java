class Solution {
    public int minCostToMoveChips(int[] position) {
        int evenCount = 0, oddCount = 0;
        
        // Count chips at even and odd positions
        for (int pos : position) {
            if (pos % 2 == 0) evenCount++;
            else oddCount++;
        }
        
        // Min cost = smaller group (even ↔ odd moves cost 1)
        return Math.min(evenCount, oddCount);

    }
}