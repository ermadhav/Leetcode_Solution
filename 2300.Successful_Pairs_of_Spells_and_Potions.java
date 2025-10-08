class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions); // Sort potions for binary search
        int n = spells.length, m = potions.length;
        int[] res = new int[n];
        
        for (int i = 0; i < n; i++) {
            // Minimum potion strength needed for this spell to succeed
            long need = (success + spells[i] - 1) / spells[i];
            
            // Find first potion >= need using binary search (manual to handle long)
            int idx = lowerBound(potions, need);
            
            // Number of successful pairs for this spell
            res[i] = m - idx;
        }
        return res;
    }

    // Helper function to find the first index with potions[idx] >= need
    private int lowerBound(int[] potions, long need) {
        int left = 0, right = potions.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (potions[mid] < need) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}
