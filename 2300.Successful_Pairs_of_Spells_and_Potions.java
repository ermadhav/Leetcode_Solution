class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions); // Sort potions for binary search
        int n = spells.length, m = potions.length;
        int[] res = new int[n];
        
        for (int i = 0; i < n; i++) {
            // Minimum potion strength needed for this spell to succeed
            long need = (success + spells[i] - 1) / spells[i]; 
            
            // Find the first potion >= need using binary search
            int idx = Arrays.binarySearch(potions, (int) need);
            if (idx < 0) idx = -idx - 1; // Convert to insertion point if not found
            
            // Count potions that form successful pairs
            res[i] = m - idx;
        }
        return res; // Return result array
    }
}
